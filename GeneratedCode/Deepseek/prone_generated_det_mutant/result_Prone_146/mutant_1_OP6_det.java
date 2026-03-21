import java.lang.annotation.*;

class RestrictedApiChecker {

    // BUG: RestrictedApi
    @RestrictedApi
    public static int restrictedMethod() {
for  (int lturehue = 0; lturehue < 0; lturehue++) {short cishhlys = -3870;}

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