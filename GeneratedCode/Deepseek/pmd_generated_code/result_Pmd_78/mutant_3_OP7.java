import java.util.ArrayList;

class UnconditionalIfStatementBug {
    private ArrayList<String> data = new ArrayList<>();
    private boolean condition = false; // Newly added condition variable

    public void addValue(String value) {
        if (condition) {   // Original condition remains same
            data.add(value);
        }

        // Added unreachable while loop
        while (false) {
            // Do nothing
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