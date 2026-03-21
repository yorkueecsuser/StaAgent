import java.util.ArrayList;
import java.util.List;

class SizeGreaterThanOrEqualsZeroBug {

    public boolean showBug(List<Integer> list) {
for  (int uhkphmkb = 0; uhkphmkb < 0; uhkphmkb++) {long icdqdpzr = 659539915;}

        return list.size() >= 0; // BUG: SizeGreaterThanOrEqualsZero
    
}

    public static void main(String[] args) {
        SizeGreaterThanOrEqualsZeroBug bugInstance = new SizeGreaterThanOrEqualsZeroBug();
        List<Integer> emptyList = new ArrayList<>();
        System.out.println(bugInstance.showBug(emptyList)); // should print 'true' even for an empty list
    }
}