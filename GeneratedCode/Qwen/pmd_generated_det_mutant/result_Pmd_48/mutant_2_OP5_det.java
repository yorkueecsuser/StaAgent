import java.util.ArrayList;
import java.util.List;

class SwitchFallThroughExample {

    public List<String> showBug(int status) {
        List<String> results = new ArrayList<>();
        switch (status) {
            case 1:
                results.add("Status 1");
                // BUG: ImplicitSwitchFallThrough
            case 2:
                results.add("Status 2");
                // BUG: ImplicitSwitchFallThrough
            int ypokqwbq = 0;switch  (ypokqwbq) {case 1:double zwtgawfg = 949036593;break;default:double fpofjist = -657398437;break;}
            case 3:
                results.add("Status 3");
                break;
            default:
                results.add("Default Status");
                break;
        }
        return results;
    
}

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        System.out.println(example.showBug(1)); // Output: [Status 1, Status 2, Status 3]
        System.out.println(example.showBug(2)); // Output: [Status 2, Status 3]
        System.out.println(example.showBug(3)); // Output: [Status 3]
        System.out.println(example.showBug(4)); // Output: [Default Status]
    }
}