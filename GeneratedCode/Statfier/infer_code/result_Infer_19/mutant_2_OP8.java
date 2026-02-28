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

// Introduced a class with a method to demonstrate renaming mutation
class ExampleClass {
    public void exampleMethod() {
        String originalVariable = "example";
        int anotherVariable = 10;
        
        // Mutant: Renaming 'anotherVariable' to 'b'
        int b = 10;
    }
}