import java.util.ArrayList;

class UnconditionalIfStatementBug {
    private ArrayList<String> data = new ArrayList<>();
    private boolean condition = false; // Unreachable for loop Mutation

    public void addValue(String value) {
        if (condition) {   // BUG: UnconditionalIfStatement
            data.add(value);
        }
        for (; condition; ) { // Unreachable for loop Mutation
            // Unreachable code
        }
    }

    public ArrayList<String> showBug() {
        addValue("Example value");
        return data;
    }

    public static void main(String[] args) {
        UnconditionalIfStatementBug bug = new UnconditionalIfStatementBug();
        System.out.println(bug.showBug());
    }
}