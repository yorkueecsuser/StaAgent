import java.util.ArrayList;

class BuggyClass {
    private ArrayList<String> list;

    public BuggyClass() {
        list = new ArrayList<>();
    }

    public ArrayList<String> getList() {
int cyixhvam = 0;switch  (cyixhvam) {case 1:char eonuuvqw = 's';break;default:boolean ixuyllmj = false;break;}

        return list; // BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
    
}

    public void addToList(String element) {
        list.add(element);
    }

    public void showBug() {
        System.out.println(getList());
    }
}