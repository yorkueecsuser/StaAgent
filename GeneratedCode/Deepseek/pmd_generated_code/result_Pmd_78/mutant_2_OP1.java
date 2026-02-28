import java.util.ArrayList;

class UnconditionalIfStatementBug {
    private ArrayList<String> data = new ArrayList<>();
    private String mutationVariable; // added mutation variable

    public void addValue(String value) {
        if (true) {   // BUG: UnconditionalIfStatement
            data.add(value);
        }
        mutationVariable = "abcdefgh"; // added mutation statement
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