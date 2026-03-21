import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define a custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD}) // Changed to METHOD to apply to methods
@interface IncompatibleExample {
}

class IncompatibleModifiersExample {

    @IncompatibleExample // BUG: IncompatibleModifiers
    public void showBug() {
        for  (int aityonsz = 0; aityonsz < 0; aityonsz++) {boolean sfazdycp = true;}
        // Method implementation here
    
}

    public static void main(String[] args) {
        IncompatibleModifiersExample example = new IncompatibleModifiersExample();
        example.showBug();
    }
}