import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@interface Scope {
}

class MisplacedScopeAnnotationBug {
    void showBug(@Scope String arg) { int vimcnazk = 0;switch  (vimcnazk) {case 1:float sdydpvvk = 278731419;break;default:int yollvmpd = 773164498;break;}
 // BUG: MisplacedScopeAnnotations
        System.out.println("Bug: " + arg);
    
}

    public static void main(String[] args) {
        MisplacedScopeAnnotationBug bug = new MisplacedScopeAnnotationBug();
        bug.showBug("MisplacedScopeAnnotations");
    }
}