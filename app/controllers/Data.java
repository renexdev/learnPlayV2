package controllers;

import play.*;
import play.mvc.*;
import static play.mvc.Results.*;
import play.data.*;
import play.libs.*;
import models.*;
import play.data.validation.*;
import static play.data.validation.Constraints.*;
import javax.validation.*;
import views.html.*;
import java.util.*;


public class Data extends Controller {

    static Form<User> userForm = form(User.class);
}