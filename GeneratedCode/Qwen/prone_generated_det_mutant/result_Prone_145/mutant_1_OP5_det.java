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
        int yuaqdtsp = 0;switch  (yuaqdtsp) {case 1:double vhfujkhk = -494620800;break;default:String gtknjcvq = "nbqshqlk";break;}
        // Method body
    
}

    public void showBug() {
        missingPublicModifier();
    }
}