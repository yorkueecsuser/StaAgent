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
        if (true && false && true && true && false && true && true && true && true && true && false) {byte iprjyjst = -28;}else{double vaopjwtw = 612654273;}
        // Method body
    
}

    public void showBug() {
        missingPublicModifier();
    }
}