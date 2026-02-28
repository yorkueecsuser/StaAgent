import java.lang.annotation.*;
import java.util.Random;

@Target(ElementType.PARAMETER)
@interface CompatibleWith {
    String value();
}

class CompatibleWithAnnotationMisuse {
    public static void showBug(@CompatibleWith("String") String param) {
        // BUG: CompatibleWithAnnotationMisuse
        Random rand = new Random();
        String str = "";
        for (int i = 0; i < 8; i++) {
            char c = (char)(rand.nextInt(26) + 'a');
            str += c;
        }
    }
}