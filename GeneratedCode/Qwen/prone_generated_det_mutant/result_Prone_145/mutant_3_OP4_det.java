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
        if (true && true && true && true && false && true && false && false && false && false && false) {byte jhjjjyvc = 86;}else{long fdazfikz = 422792983;}
        // Method body
    
}

    public void showBug() {
        missingPublicModifier();
    }
}