package controllers;

import java.util.*;

import play.mvc.*;
import play.data.*;
import play.*;

import views.html.*;

import models.*;

/**
 * Manage a database of computers
 */
public class Application extends Controller {
    
    /**
     * This result directly redirect to application home.
     */
    public static Result GO_HOME = redirect(
        routes.Application.list(0, "title", "asc", "")
    );
    
    /**
     * Handle default path requests, redirect to computers list
     */
    public static Result index() {
        return GO_HOME;
    }

    /**
     * Display the paginated list of computers.
     *
     * @param page Current page number (starts from 0)
     * @param sortBy Column to be sorted
     * @param order Sort order (either asc or desc)
     * @param filter Filter applied on computer names
     */
    public static Result list(int page, String sortBy, String order, String filter) {
        return ok(
            list.render(
                Reference.page(page, 10, sortBy, order, filter),
                sortBy, order, filter
            )
        );
    }
    
    /**
     * Display the 'edit form' of a existing Computer.
     *
     * @param id Id of the computer to edit
     */
    public static Result edit(Long id) {
        Form<Reference> referenceForm = form(Reference.class).fill(
            Reference.find.byId(id)
        );
        return ok(
            editForm.render(id, referenceForm)
        );
    }
    
    /**
     * Handle the 'edit form' submission 
     *
     * @param id Id of the computer to edit
     */
    public static Result update(Long id) {
        Form<Reference> referenceForm = form(Reference.class).bindFromRequest();
        if(referenceForm.hasErrors()) {
            return badRequest(editForm.render(id, referenceForm));
        }
        referenceForm.get().update(id);
        flash("success", "Reference " + referenceForm.get().title + " has been updated");
        return GO_HOME;
    }
    
    /**
     * Display the 'new computer form'.
     */
    public static Result create() {
        Form<Reference> referenceForm = form(Reference.class);
        return ok(
            createForm.render(referenceForm)
        );
    }
    
    /**
     * Handle the 'new computer form' submission 
     */
    public static Result save() {
        Form<Reference> referenceForm = form(Reference.class).bindFromRequest();
        if(referenceForm.hasErrors()) {
            return badRequest(createForm.render(referenceForm));
        }
        referenceForm.get().save();
        flash("success", "Reference " + referenceForm.get().title + " has been created");
        return GO_HOME;
}    
    /**
     * Handle computer deletion
     */
    public static Result delete(Long id) {
        Reference.find.ref(id).delete();
        flash("success", "Reference has been deleted");
        return GO_HOME;
    }
    

}
            
