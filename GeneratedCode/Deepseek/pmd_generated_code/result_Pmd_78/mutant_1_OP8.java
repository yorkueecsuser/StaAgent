import java.util.ArrayList;

class UnconditionalIfStatementBug {
    private ArrayList<String> data = new ArrayList<>();

    public void addValue(String value) {
        if (true) {   // BUG: UnconditionalIfStatement
            data.add(value);
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

    public void mutationRenaming() {
        String renamedVariable = "newName";
        if (true) {   // Mutated code
            data.add(renamedVariable);
        }
    }
}