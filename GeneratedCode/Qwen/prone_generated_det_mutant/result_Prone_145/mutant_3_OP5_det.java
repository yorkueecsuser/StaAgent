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
        int nwcjvcnt = 0;switch  (nwcjvcnt) {case 1:short yglvrllv = -1633;break;default:String ikgggztj = "etfupuit";break;}
        // Method body
    
}

    public void showBug() {
        missingPublicModifier();
    }
}