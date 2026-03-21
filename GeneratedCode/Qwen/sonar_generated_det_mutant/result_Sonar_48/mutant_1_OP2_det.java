import java.util.List;
import java.util.Arrays;

class AssertJBugExample {

    public boolean showBug1(List<String> logs) {
        return logs.stream().allMatch(e -> e.contains("error")); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
    }

    public boolean showBug2(List<String> logs) {
        return!logs.contains("error"); // BUG: AssertJ assertions "allMatch" and "doesNotContains" should also test for emptiness
    }
public static void main(String [] args){
    AssertJBugExample example = new AssertJBugExample();
    example = new AssertJBugExample();
    System.out.println(example.showBug1(Arrays.asList()));
    System.out.println(example.showBug2(Arrays.asList()));
}
}