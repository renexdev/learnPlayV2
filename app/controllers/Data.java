package controllers;

import play.*;
import play.mvc.*;
import static play.mvc.Results.*;
import play.data.*; //Este tiene para el Form  
import play.libs.*;
import models.*;
import play.data.validation.*;
import static play.data.validation.Constraints.*;
import javax.validation.*;
import views.html.*;
import java.util.*;


public class Data extends Controller {

    //static Form<User> userForm = form(User.class);
    static Form<User> userForm = Form.form(User.class);
    //The underlying binding is done using Spring data binder
    public static Result test(){
        Map<String,String> toBind = new HashMap<String,String>();
        //Map<String,String> toBind = new HashMap(); //warn uses unchecked or unsafe operations.
        toBind.put("name","Arturo"); //la primera key tiene que coincidir con la variable de la Clase

        User user = userForm.bind(toBind).get();
        //https://www.playframework.com/documentation/2.2.x/JavaForms
        return ok(data.render(user));

    }
}