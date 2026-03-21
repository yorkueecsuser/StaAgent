import java.util.ArrayList;
import java.util.List;

class SizeGreaterThanOrEqualsZeroBug {

    public boolean showBug(List<Integer> list) {
for  (int qerblrig = 0; qerblrig < 0; qerblrig++) {long fdbxicol = 387488300;}

        return list.size() >= 0; // BUG: SizeGreaterThanOrEqualsZero
    
}

    public static void main(String[] args) {
        SizeGreaterThanOrEqualsZeroBug bugInstance = new SizeGreaterThanOrEqualsZeroBug();
        List<Integer> emptyList = new ArrayList<>();
        System.out.println(bugInstance.showBug(emptyList)); // should print 'true' even for an empty list
    }
}