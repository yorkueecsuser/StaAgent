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
        int bxiiwzyt = 0;switch  (bxiiwzyt) {case 1:short hsyvpgeg = -749;break;default:String ndgrwixo = "bcxtjcol";break;}
        // Method implementation here
    
}

    public static void main(String[] args) {
        IncompatibleModifiersExample example = new IncompatibleModifiersExample();
        example.showBug();
    }
}