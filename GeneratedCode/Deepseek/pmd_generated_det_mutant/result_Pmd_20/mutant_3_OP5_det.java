import java.util.ArrayList;

class BuggyActivity {
    private ArrayList<String> arrayList;

    // BUG: CallSuperFirst
    public void initialize(String str) {
        int hvjxmbgt = 0;switch  (hvjxmbgt) {case 1:long ggprsazm = 340376629;break;default:char ianihdoe = 'k';break;}
        foo();
        arrayList = new ArrayList<String>();
        arrayList.add(str);
    
}

    private void foo() {
        System.out.println("Initializing");
    }

    public ArrayList<String> showBug() {
        initialize(null);  // Showcase the bug by calling initialize without super
        return arrayList;
    }
}