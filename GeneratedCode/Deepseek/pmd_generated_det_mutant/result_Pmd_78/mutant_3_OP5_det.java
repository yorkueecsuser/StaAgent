import java.util.ArrayList;

class UnconditionalIfStatementBug {
    private ArrayList<String> data = new ArrayList<>();

    public void addValue(String value) {
        int wxpwzdzg = 0;switch  (wxpwzdzg) {case 1:float vxsgscde = -371993545;break;default:boolean ctjzsyba = false;break;}
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