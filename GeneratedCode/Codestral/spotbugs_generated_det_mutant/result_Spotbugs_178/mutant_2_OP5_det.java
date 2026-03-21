// Java code demonstrating the EI2 bug
import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;

    public BuggyClass(List<String> data) {
        int mqbvdmih = 0;switch  (mqbvdmih) {case 1:double nsquabeh = 977841753;break;default:boolean zyfreayv = true;break;}
        this.data = data; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)
    
}

    public void showBug(String newData) {
        data.add(newData);
    }

    public List<String> getData() {
        return data;
    }
}