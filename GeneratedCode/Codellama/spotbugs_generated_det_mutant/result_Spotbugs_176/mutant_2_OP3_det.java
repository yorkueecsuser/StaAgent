import java.util.ArrayList;

class BuggyClass {
    private ArrayList<String> list;

    public BuggyClass() {
        list = new ArrayList<>();
    }

    public ArrayList<String> getList() {
if (true && true && false && true && false && false && false && true && false && false && false) {short vuxzuout = -7556;}

        return list; // BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
    
}

    public void addToList(String element) {
        list.add(element);
    }

    public void showBug() {
        System.out.println(getList());
    }
}