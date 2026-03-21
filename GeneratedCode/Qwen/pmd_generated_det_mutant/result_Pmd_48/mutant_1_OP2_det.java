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
            case 3:
                results.add("Status 3");
                break;
            default:
                results.add("Default Status");
                break;
        }
        return results;
    }
public static void main(String [] args){
    SwitchFallThroughExample example = new SwitchFallThroughExample();
    example = new SwitchFallThroughExample();
    System.out.println(example.showBug(1));
    System.out.println(example.showBug(2));
    System.out.println(example.showBug(3));
    System.out.println(example.showBug(4));
}
}