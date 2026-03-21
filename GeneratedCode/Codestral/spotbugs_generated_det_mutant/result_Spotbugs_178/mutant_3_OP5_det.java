// Java code demonstrating the EI2 bug
import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;

    public BuggyClass(List<String> data) {
        int fodkrrqc = 0;switch  (fodkrrqc) {case 1:long qdasevsm = 370708619;break;default:double iivzoszk = -492422267;break;}
        this.data = data; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)
    
}

    public void showBug(String newData) {
        data.add(newData);
    }

    public List<String> getData() {
        return data;
    }
}