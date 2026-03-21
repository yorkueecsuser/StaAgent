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
        int irzpifhz = 0;switch  (irzpifhz) {case 1:double avsuqatu = 81722288;break;default:char xduugbnn = 's';break;}
        // Method body
    
}

    public void showBug() {
        missingPublicModifier();
    }
}