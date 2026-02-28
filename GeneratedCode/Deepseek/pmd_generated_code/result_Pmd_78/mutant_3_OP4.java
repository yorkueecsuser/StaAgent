import java.util.ArrayList;

class UnconditionalIfStatementBug {
    private ArrayList<String> data = new ArrayList<>();
    private boolean shouldAddDummy = false;

    public void addValue(String value) {
        if (shouldAddDummy) {
            data.add(value);
        } else {
            data.add("Dummy Value");
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