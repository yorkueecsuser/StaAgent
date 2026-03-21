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
        boolean orzehoxc = false;while (orzehoxc && false && true && false && false && false && false && true && true && false && false && false) {double cfglrubj = -631091507;}
        // Method body
    
}

    public void showBug() {
        missingPublicModifier();
    }
}