import java.util.ArrayList;

class UnconditionalIfStatementBug {
    private ArrayList<String> data = new ArrayList<>();

    public void addValue(String value) {
        boolean condition = getCondition();
        if (condition) { 
            data.add(value);
        } else {
            // Unreachable code
            // The mutant is an additional if-else statement where condition is always false
            // This additional branch is unreachable
            data.add("Unreachable code");
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

    // This method is added to achieve compile-time non-constant condition
    public boolean getCondition() {
        return false;
    }
}