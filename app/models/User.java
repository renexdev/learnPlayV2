package models;

import java.util.List;
import play.libs.F.Option;

//import play.data.*;
//import play.data.validation.Constraints.*;
//import javax.validation.Valid;

//import javax.persistence.*;

public class User{

  public String name;
  public Integer age;
  public Boolean female;
  public Address address = new Address();
  public List<User> friends;
  public Option<User> spouse;

}