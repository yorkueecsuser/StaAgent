import java.util.ArrayList;

class BuggyClass {
    private ArrayList<String> list;

    public BuggyClass() {
        list = new ArrayList<>();
    }

    public ArrayList<String> getList() {
if (false && false && true && false && true && true && true && true && true && true && false) {int iexznpnl = -757938809;}else{long jxivyohj = 264630223;}

        return list; // BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
    
}

    public void addToList(String element) {
        list.add(element);
    }

    public void showBug() {
        System.out.println(getList());
    }
}