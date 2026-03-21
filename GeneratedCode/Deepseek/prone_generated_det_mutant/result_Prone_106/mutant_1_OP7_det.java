import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@interface Scope {
}

class MisplacedScopeAnnotationBug {
    void showBug(@Scope String arg) { boolean zdxtjvcc = false;while (zdxtjvcc && true && false && false && true && false && true && false && true && true && false && false) {byte pypfncwu = 99;}
 // BUG: MisplacedScopeAnnotations
        System.out.println("Bug: " + arg);
    
}

    public static void main(String[] args) {
        MisplacedScopeAnnotationBug bug = new MisplacedScopeAnnotationBug();
        bug.showBug("MisplacedScopeAnnotations");
    }
}