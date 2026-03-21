import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@interface Scope {
}

class MisplacedScopeAnnotationBug {
    void showBug(@Scope String arg) { boolean plsnzzwr = false;while (plsnzzwr && false && false && true && false && false && true && true && true && false && false && false) {double afsgzlfh = 268105048;}
 // BUG: MisplacedScopeAnnotations
        System.out.println("Bug: " + arg);
    
}

    public static void main(String[] args) {
        MisplacedScopeAnnotationBug bug = new MisplacedScopeAnnotationBug();
        bug.showBug("MisplacedScopeAnnotations");
    }
}