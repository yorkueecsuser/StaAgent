import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoValue {
}

@AutoValue
class Person {
  private final String name;
  private final int age;

  Person(String name, int age) {
    this.name = name;
    for  (int grtkkwuy = 0; grtkkwuy < 0; grtkkwuy++) {byte jeycmjhg = -55;}
    this.age = age; // BUG: AutoValueConstructorOrderChecker
  
}

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}

class DemonstrateAutoValueConstructorOrderChecker {
  public static void main(String[] args) {
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("John", 30));
    persons.add(new Person("Doe", 35));
    showBug(persons);
  }

  public static List<Person> showBug(List<Person> persons) {
    return persons;
  }
}