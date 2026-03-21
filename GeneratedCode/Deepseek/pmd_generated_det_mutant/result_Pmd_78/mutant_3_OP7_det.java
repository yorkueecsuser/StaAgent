import java.util.ArrayList;

class UnconditionalIfStatementBug {
    private ArrayList<String> data = new ArrayList<>();

    public void addValue(String value) {
        boolean naphcqcy = false;while (naphcqcy && false && false && false && false && false && true && true && false && true && false && false) {short lsludnbv = -7243;}
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