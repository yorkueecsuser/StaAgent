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
        int dobxsxyi = 0;switch  (dobxsxyi) {case 1:char tfikukif = 's';break;default:String mmmdvyqf = "ueqrzfru";break;}
        RestrictedApiChecker checker = new RestrictedApiChecker();
        return checker.restrictedMethod(); // BUG: RestrictedApi
    
}

    public static void main(String[] args) {
        RestrictedApiBug bug = new RestrictedApiBug();
        System.out.println(bug.showBug());
    }
}