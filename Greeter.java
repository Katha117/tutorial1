import java.util.Locale;
import java.util.ResourceBundle;

public class Greeter {

  private Locale locale;
  private String name;

  public Greeter(String language, String country, String name) {
    locale = new Locale(language, country);
    this.name = name;
  }

  public String sayHello() {
    ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);
    return messages.getString("greeting") + ", " + name.toUpperCase();
  }

  public static void main(String[] args) {
    if ((args.length > 0) && (args.length<=3)) {
      String language = args[0];
      String country = args[1];
      String name = args[2];
      Greeter greeter = new Greeter(language, country, name);
      System.out.println(greeter.sayHello());
    } else {
      System.out.println("Invalid argument entered");
    }
  }
}
