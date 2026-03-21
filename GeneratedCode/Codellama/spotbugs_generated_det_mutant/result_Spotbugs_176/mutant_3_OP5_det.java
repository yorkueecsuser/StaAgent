import java.util.ArrayList;

class BuggyClass {
    private ArrayList<String> list;

    public BuggyClass() {
        list = new ArrayList<>();
    }

    public ArrayList<String> getList() {
int qjalmmrb = 0;switch  (qjalmmrb) {case 1:boolean grdicnmw = true;break;default:int kpzzplbt = -644896711;break;}

        return list; // BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
    
}

    public void addToList(String element) {
        list.add(element);
    }

    public void showBug() {
        System.out.println(getList());
    }
}