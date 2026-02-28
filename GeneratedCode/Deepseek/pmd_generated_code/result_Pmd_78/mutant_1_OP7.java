import java.util.ArrayList;

class UnreachableWhileLoopBug {
    private ArrayList<String> data = new ArrayList<>();
    private boolean condition = true;

    public void addValue(String value) {
        if (condition) {   // BUG: UnconditionalIfStatement
            data.add(value);
        }
    }

    public ArrayList<String> showBug() {
        addValue("Example value");
        return data;
    }

    public static void main(String[] args) {
        UnreachableWhileLoopBug bug = new UnreachableWhileLoopBug();

        while (false){ // Unreachable While Loop Mutant
            System.out.println("Unreachable Code");
        }

        System.out.println(bug.showBug());
    }
}