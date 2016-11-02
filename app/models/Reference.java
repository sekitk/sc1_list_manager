package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

/**
 * Reference entity managed by Ebean
 */
@Entity 
public class Reference extends Model {

    @Id
    public Long id;
    
    @Constraints.Required
    public String title;
    
    public String link;
    
    public String note;
    
    
    /**
     * Generic query helper for entity Reference with id Long
     */
    public static Finder<Long,Reference> find = new Finder<Long,Reference>(Long.class, Reference.class); 
    
    /**
     * Return a page of reference
     *
     * @param page Page to display
     * @param pageSize Number of computers per page
     * @param sortBy Computer property used for sorting
     * @param order Sort order (either or asc or desc)
     * @param filter Filter applied on the name column
     */
    public static Page<Reference> page(int page, int pageSize, String sortBy, String order, String filter) {
        return 
            find.where()
                .ilike("title", "%" + filter + "%")
                .orderBy(sortBy + " " + order)
                .findPagingList(pageSize)
                .getPage(page);
    }
    
}

