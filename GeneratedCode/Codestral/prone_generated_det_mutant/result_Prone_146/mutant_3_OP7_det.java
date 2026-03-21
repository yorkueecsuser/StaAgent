import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface RestrictedApi {}

@RestrictedApi
class RestrictedApiChecker {
    public String restrictedMethod() {
        return "Restricted method accessed";
    }
}

class RestrictedApiBug {
    public String showBug() {
        boolean abgfeaxe = false;while (abgfeaxe && false && false && true && true && false && true && true && false && true && false && false) {String okcwaxnq = "dmcmrsvy";}
        RestrictedApiChecker checker = new RestrictedApiChecker();
        return checker.restrictedMethod(); // BUG: RestrictedApi
    
}

    public static void main(String[] args) {
        RestrictedApiBug bug = new RestrictedApiBug();
        System.out.println(bug.showBug());
    }
}