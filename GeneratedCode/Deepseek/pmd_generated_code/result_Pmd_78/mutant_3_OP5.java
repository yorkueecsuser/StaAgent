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
        int value = 0;    // Mutant: Unreachable switch statement
        switch(value) {
            case 1: 
                System.out.println("This is unreachable switch statement");
                break;
        }
        return data;
    }

    public static void main(String[] args) {
        UnconditionalIfStatementBug bug = new UnconditionalIfStatementBug();
        System.out.println(bug.showBug());
    }
}