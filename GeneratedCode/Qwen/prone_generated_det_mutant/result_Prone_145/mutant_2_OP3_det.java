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
        if (true && false && true && true && false && false && true && false && false && false && false) {int qnxxsmyc = 523356782;}
        // Method body
    
}

    public void showBug() {
        missingPublicModifier();
    }
}