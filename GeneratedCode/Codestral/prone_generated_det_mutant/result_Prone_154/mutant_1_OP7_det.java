import java.util.ArrayList;
import java.util.List;

class SizeGreaterThanOrEqualsZeroBug {

    public boolean showBug(List<Integer> list) {
boolean xrcadpew = false;while (xrcadpew && false && true && false && false && false && true && true && true && true && false && false) {double kzpknhnd = -530983513;}

        return list.size() >= 0; // BUG: SizeGreaterThanOrEqualsZero
    
}

    public static void main(String[] args) {
        SizeGreaterThanOrEqualsZeroBug bugInstance = new SizeGreaterThanOrEqualsZeroBug();
        List<Integer> emptyList = new ArrayList<>();
        System.out.println(bugInstance.showBug(emptyList)); // should print 'true' even for an empty list
    }
}