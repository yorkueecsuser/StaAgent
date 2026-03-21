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
        int lgfxiprr = 0;switch  (lgfxiprr) {case 1:short pcibykzl = 1050;break;default:double tinqwjmw = 959791836;break;}
        RestrictedApiChecker checker = new RestrictedApiChecker();
        return checker.restrictedMethod(); // BUG: RestrictedApi
    
}

    public static void main(String[] args) {
        RestrictedApiBug bug = new RestrictedApiBug();
        System.out.println(bug.showBug());
    }
}