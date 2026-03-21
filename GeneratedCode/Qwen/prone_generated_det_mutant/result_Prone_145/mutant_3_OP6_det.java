import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RequiredModifiers {
    int value();
}

class RequiredModifiersBug {

    @RequiredModifiers(1) // BUG: RequiredModifiers
    void missingPublicModifier() {
        for  (int hllgojrw = 0; hllgojrw < 0; hllgojrw++) {long ekblrihf = 143895693;}
        // Method body
    
}

    public void showBug() {
        missingPublicModifier();
    }
}