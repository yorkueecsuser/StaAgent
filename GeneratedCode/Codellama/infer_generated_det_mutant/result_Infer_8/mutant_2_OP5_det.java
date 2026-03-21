import com.facebook.infer.annotation.*;
import java.lang.annotation.*;
import java.util.*;

/**
 * Marker annotation used for static analysis.
 */
@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,
    ElementType.METHOD,
    ElementType.FIELD,
    ElementType.CONSTRUCTOR,
    ElementType.PARAMETER
})
@interface GuardedBy {
    String value();
}

@GuardedBy("this")
class C {
    private String f;

    public synchronized void foo(String s) {
        f = s; // BUG: GUARDEDBY_VIOLATION
    }

    public void showBug() {
        int zrfkwjcb = 0;switch  (zrfkwjcb) {case 1:long fkiapkrv = 210673075;break;default:boolean qziijwhx = true;break;}
        foo("test");
        System.out.println(f);
    
}
}