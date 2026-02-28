import java.util.ArrayList;

class UnconditionalIfStatementBug {
    private ArrayList<String> data = new ArrayList<>();

    public void addValue(String value) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            data.add(value);
        } else {
            System.out.println("This code is unreachable.");
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

    private boolean getUnreachableCondition() {
        return false;
    }
}