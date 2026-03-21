// Java code demonstrating the EI2 bug
import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;

    public BuggyClass(List<String> data) {
        boolean uabirmtl = false;while (uabirmtl && false && true && false && true && false && false && true && true && false && false && false) {short qxjiaabm = -3263;}
        this.data = data; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)
    
}

    public void showBug(String newData) {
        data.add(newData);
    }

    public List<String> getData() {
        return data;
    }
}