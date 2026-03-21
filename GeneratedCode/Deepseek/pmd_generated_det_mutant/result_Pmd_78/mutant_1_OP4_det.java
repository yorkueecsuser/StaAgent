import java.util.ArrayList;

class UnconditionalIfStatementBug {
    private ArrayList<String> data = new ArrayList<>();

    public void addValue(String value) {
        if (false && false && true && false && true && true && true && false && false && false && false) {byte ontzavyf = 122;}else{boolean mmxmgzcj = true;}
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
}