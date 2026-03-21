import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@interface Scope {
}

class MisplacedScopeAnnotationBug {
    void showBug(@Scope String arg) { if (true && false && true && true && false && false && false && false && false && true && false) {byte kseyggaj = -84;}else{float fayfwdrj = -537077743;}
 // BUG: MisplacedScopeAnnotations
        System.out.println("Bug: " + arg);
    
}

    public static void main(String[] args) {
        MisplacedScopeAnnotationBug bug = new MisplacedScopeAnnotationBug();
        bug.showBug("MisplacedScopeAnnotations");
    }
}