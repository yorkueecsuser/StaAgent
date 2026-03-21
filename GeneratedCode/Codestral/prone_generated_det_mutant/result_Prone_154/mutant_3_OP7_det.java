import java.util.ArrayList;
import java.util.List;

class SizeGreaterThanOrEqualsZeroBug {

    public boolean showBug(List<Integer> list) {
boolean ltiyueet = false;while (ltiyueet && true && true && false && false && true && false && false && true && true && false && false) {short czyvehfg = -3646;}

        return list.size() >= 0; // BUG: SizeGreaterThanOrEqualsZero
    
}

    public static void main(String[] args) {
        SizeGreaterThanOrEqualsZeroBug bugInstance = new SizeGreaterThanOrEqualsZeroBug();
        List<Integer> emptyList = new ArrayList<>();
        System.out.println(bugInstance.showBug(emptyList)); // should print 'true' even for an empty list
    }
}