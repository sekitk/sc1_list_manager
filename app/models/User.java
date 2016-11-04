package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

/**
 * User entity managed by Ebean
 */
@Entity 
public class User extends Model {

    @Id
    public Long id;
    
    @Constraints.Required
    public String email;
    
    
    public String password;
    
    
    /**
     * Generic query helper for entity User with id Long
     */
    public static Finder<Long,User> find = new Finder<Long,User>(Long.class, User.class); 
    
    /**
     * Return a page of reference
     *
     * @param page Page to display
     * @param pageSize Number of computers per page
     * @param sortBy Computer property used for sorting
     * @param order Sort order (either or asc or desc)
     * @param filter Filter applied on the name column
     */
    public static Page<User> page(int page, int pageSize, String sortBy, String order, String filter) {
        return 
            find.where()
                .ilike("title", "%" + filter + "%")
                .orderBy(sortBy + " " + order)
                .findPagingList(pageSize)
                .getPage(page);
    }

    public static User authenticate(String email, String password){
      return find.where().eq("email",email)
      .eq("password",password).findUnique();
     }
    
}

