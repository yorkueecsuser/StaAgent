import java.util.Arrays;

class UselessStringBug {

    public String showBug() {
        String unusedVar = "deadstore";
        String result = Arrays.toString(new int[] {1, 2, 3}); // corrected the bug
        return result;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}