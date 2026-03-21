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
        for  (int pbyylpao = 0; pbyylpao < 0; pbyylpao++) {short hsirzabk = -1971;}
        RestrictedApiChecker checker = new RestrictedApiChecker();
        return checker.restrictedMethod(); // BUG: RestrictedApi
    
}

    public static void main(String[] args) {
        RestrictedApiBug bug = new RestrictedApiBug();
        System.out.println(bug.showBug());
    }
}