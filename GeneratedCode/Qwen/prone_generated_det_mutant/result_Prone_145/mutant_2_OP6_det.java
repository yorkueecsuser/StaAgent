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
        for  (int rnwrlyab = 0; rnwrlyab < 0; rnwrlyab++) {float ozkbsvum = -166098618;}
        // Method body
    
}

    public void showBug() {
        missingPublicModifier();
    }
}