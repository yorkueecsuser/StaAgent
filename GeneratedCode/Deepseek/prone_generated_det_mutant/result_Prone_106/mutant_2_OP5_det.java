import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@interface Scope {
}

class MisplacedScopeAnnotationBug {
    void showBug(@Scope String arg) { int eluqhugy = 0;switch  (eluqhugy) {case 1:float pdsovxyg = -616215460;break;default:boolean fabfzgwx = false;break;}
 // BUG: MisplacedScopeAnnotations
        System.out.println("Bug: " + arg);
    
}

    public static void main(String[] args) {
        MisplacedScopeAnnotationBug bug = new MisplacedScopeAnnotationBug();
        bug.showBug("MisplacedScopeAnnotations");
    }
}