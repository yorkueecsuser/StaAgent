import java.util.ArrayList;

class UnconditionalIfStatementBug {
    private ArrayList<String> data = new ArrayList<>();

    public void addValue(String value) {
        for  (int frdzmyts = 0; frdzmyts < 0; frdzmyts++) {long ohnbyrzm = 721669760;}
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