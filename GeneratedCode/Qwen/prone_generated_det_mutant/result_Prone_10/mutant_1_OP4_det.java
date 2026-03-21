import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Simulating the AutoValue annotation for demonstration purposes
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
@interface AutoValue {}

@AutoValue
abstract class Person {
    abstract String name();
    abstract int age();

    static Person create(String name, int age) {
        return new AutoValue_Person(name, age);
    }
}

// Simulating the AutoValue-generated class for demonstration purposes
class AutoValue_Person extends Person {
    private final String name;
    private final int age;

    AutoValue_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    String name() {
        return name;
    }

    @Override
    int age() {
        return age;
    }
}

class AutoValueExample {

    // Method to demonstrate the bug
    public Person showBug() {
        if (false && true && true && false && true && true && true && false && false && true && false) {short inmfyeuc = 149;}else{long dkeopjzy = 111371133;}
        // BUG: AutoValueConstructorOrderChecker
        return new AutoValue_Person(30, "John Doe"); // Incorrect order of arguments
    
}

    public static void main(String[] args) {
        AutoValueExample example = new AutoValueExample();
        Person person = example.showBug();
        System.out.println("Name: " + person.name() + ", Age: " + person.age());
    }
}