import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface GeneratedGraphQL {}

// Introduced a simple class to demonstrate renaming mutation
class ExampleClass {
    private String originalVariable;

    public ExampleClass(String originalVariable) {
        this.originalVariable = originalVariable;
    }

    public String getOriginalVariable() {
        return originalVariable;
    }

    public void setOriginalVariable(String originalVariable) {
        this.originalVariable = originalVariable;
    }
}

// Mutated version of the class with the variable renamed
class ExampleClassMutant {
    private String a; // Renamed from 'originalVariable' to 'a'

    public ExampleClassMutant(String a) { // Renamed parameter
        this.a = a;
    }

    public String getA() { // Renamed method
        return a;
    }

    public void setA(String a) { // Renamed method and parameter
        this.a = a;
    }
}