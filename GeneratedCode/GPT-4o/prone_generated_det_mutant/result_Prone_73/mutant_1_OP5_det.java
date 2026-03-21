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
        int giihrfpo = 0;switch  (giihrfpo) {case 1:short ptyzqkrv = 3167;break;default:String ulppsmhn = "jarsytqz";break;}
        // Method implementation here
    
}

    public static void main(String[] args) {
        IncompatibleModifiersExample example = new IncompatibleModifiersExample();
        example.showBug();
    }
}