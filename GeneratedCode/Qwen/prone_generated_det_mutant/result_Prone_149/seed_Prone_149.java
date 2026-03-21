import java.util.Objects;

class SelfAssignmentBug {

    public int showBug(int value) {
        value = value; // BUG: SelfAssignment
        return value;
    }

    public String showBug2(String str) {
        str = Objects.requireNonNull(str); // BUG: SelfAssignment
        return str;
    }

    public static void main(String[] args) {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug();
        System.out.println(bugDemo.showBug(10));
        System.out.println(bugDemo.showBug2("Hello"));
    }
}