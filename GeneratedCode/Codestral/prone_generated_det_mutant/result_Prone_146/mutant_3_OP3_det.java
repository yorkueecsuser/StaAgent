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
        if (true && false && true && true && true && true && false && true && false && true && false) {float wqknzfrb = -583246434;}
        RestrictedApiChecker checker = new RestrictedApiChecker();
        return checker.restrictedMethod(); // BUG: RestrictedApi
    
}

    public static void main(String[] args) {
        RestrictedApiBug bug = new RestrictedApiBug();
        System.out.println(bug.showBug());
    }
}