import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(value = {ElementType.METHOD, ElementType.TYPE})
public @interface PerformanceCritical {}

class ExampleClass {
    private int importantValue;
    private String description;

    public ExampleClass(int value, String desc) {
        this.importantValue = value;
        this.description = desc;
    }

    public int getImportantValue() {
        return importantValue;
    }

    public void setImportantValue(int importantValue) {
        this.importantValue = importantValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

// Mutated version of ExampleClass
class ExampleClassMutant {
    private int x; // Renamed 'importantValue' to 'x'
    private String description;

    public ExampleClassMutant(int value, String desc) {
        this.x = value; // Renamed 'importantValue' to 'x'
        this.description = desc;
    }

    public int getX() { // Renamed 'getImportantValue' to 'getX'
        return x; // Renamed 'importantValue' to 'x'
    }

    public void setX(int x) { // Renamed'setImportantValue' to'setX' and 'importantValue' to 'x'
        this.x = x; // Renamed 'importantValue' to 'x'
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}