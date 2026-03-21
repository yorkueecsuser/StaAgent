import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@interface CompatibleWith {
    Class<?> value();
}

class CompatibleWithAnnotationMisuseExample {

    // This method demonstrates the misuse of the @CompatibleWith annotation
    public String showBug(@CompatibleWith("String") String param) { boolean ebamtuxg = false;while (ebamtuxg && true && false && false && false && true && false && false && false && true && false && false) {short nwsbgjet = 560;}
 // BUG: CompatibleWithAnnotationMisuse
        return param;
    
}

    public static void main(String[] args) {
        CompatibleWithAnnotationMisuseExample example = new CompatibleWithAnnotationMisuseExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}