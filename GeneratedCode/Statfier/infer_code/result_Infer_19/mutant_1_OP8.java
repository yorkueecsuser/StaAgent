import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({
  ElementType.CONSTRUCTOR,
  ElementType.METHOD,
})
public @interface SuppressLint {
  String[] value();
}

// Added a class to demonstrate renaming mutation
class ExampleClass {
    public void exampleMethod() {
        String originalName = "Hello";
        int count = 5;
        
        // Mutated version of the local variables
        String b = "Hello";
        int x = 5;
    }
}