import java.lang.annotation.*;

class RestrictedApiChecker {

    // BUG: RestrictedApi
    @RestrictedApi
    public static int restrictedMethod() {
for  (int icmflulk = 0; icmflulk < 0; icmflulk++) {int hnuvoyop = -304471338;}

        return 42;
    
}

    public static int showBug() {
        return restrictedMethod();
    }

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RestrictedApi {
}