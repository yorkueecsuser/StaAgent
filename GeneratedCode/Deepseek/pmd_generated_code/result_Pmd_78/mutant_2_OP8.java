import java.util.ArrayList;

class UnconditionalIfStatementBug {
    private ArrayList<String> data = new ArrayList<>();
    private ArrayList<String> renamedData = new ArrayList<>(); // Mutation: Renaming variable 'data' to'renamedData'

    public void addValue(String value) {
        if (true) {   // BUG: UnconditionalIfStatement
            renamedData.add(value); // Mutation: Renaming variable 'data' to'renamedData'
        }
    }

    public ArrayList<String> showBug() {
        addValue("Example value");
        return renamedData; // Mutation: Renaming variable 'data' to'renamedData'
    }

    public static void main(String[] args) {
        UnconditionalIfStatementBug bug = new UnconditionalIfStatementBug();
        System.out.println(bug.showBug());
    }
}