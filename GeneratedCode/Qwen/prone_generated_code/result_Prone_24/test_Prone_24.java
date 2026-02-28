import org.junit.Test;
import static org.junit.Assert.*;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@interface CompatibleWith {
    Class<?> value();
}

class CompatibleWithAnnotationMisuseExample {

    // This method demonstrates the misuse of the @CompatibleWith annotation
    public String showBug(@CompatibleWith("String") String param) { // TRIGGER BUG: CompatibleWithAnnotationMisuse
        return param;
    }

    public static void main(String[] args) {
        CompatibleWithAnnotationMisuseExample example = new CompatibleWithAnnotationMisuseExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}

public class CompatibleWithAnnotationMisuseExampleTest {

    @Test
    public void testShowBug() {
        CompatibleWithAnnotationMisuseExample example = new CompatibleWithAnnotationMisuseExample();
        example.showBug("Hello, World!"); // TRIGGER BUG: CompatibleWithAnnotationMisuse
    }
}