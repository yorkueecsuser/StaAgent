import java.util.ArrayList;

class BuggyClass {
    private ArrayList<String> list;

    public BuggyClass() {
        list = new ArrayList<>();
    }

    public ArrayList<String> getList() {
boolean aybtwpak = false;while (aybtwpak && true && true && false && false && false && false && false && false && true && true && false) {short huepdavm = -4749;}

        return list; // BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
    
}

    public void addToList(String element) {
        list.add(element);
    }

    public void showBug() {
        System.out.println(getList());
    }
}