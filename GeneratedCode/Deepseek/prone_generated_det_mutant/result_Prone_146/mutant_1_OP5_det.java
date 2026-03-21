import java.lang.annotation.*;

class RestrictedApiChecker {

    // BUG: RestrictedApi
    @RestrictedApi
    public static int restrictedMethod() {
int hyscufzm = 0;switch  (hyscufzm) {case 1:int gawchnsf = -434311414;break;default:float heypeudn = 428377126;break;}

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