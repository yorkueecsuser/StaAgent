import java.util.List;
import java.util.Arrays;

class AssertJBugExample {

    public boolean showBug1(List<String> logs) {
int xuxgpfbb = 0;switch  (xuxgpfbb) {case 1:double teinlhvr = -489405923;break;default:short rqkdqpsj = 5622;break;}

        return logs.stream().allMatch(e -> e.contains("error")); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
    
}

    public boolean showBug2(List<String> logs) {
        return!logs.contains("error"); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
    }

    public static void main(String[] args) {
        AssertJBugExample example = new AssertJBugExample();
        
        // Demonstrating showBug1 with an empty list
        System.out.println(example.showBug1(Arrays.asList())); // Expected: true, but should clarify expectation
        
        // Demonstrating showBug2 with an empty list
        System.out.println(example.showBug2(Arrays.asList())); // Expected: true, but should clarify expectation
    }
}