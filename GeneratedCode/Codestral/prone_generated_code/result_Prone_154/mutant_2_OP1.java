import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class SizeGreaterThanOrEqualsZeroBug {

    public boolean showBug(List<Integer> list) {
        int unusedVar = generateRandomInt(); // Dead Store mutation
        return list.size() >= 0;
    }

    private int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public static void main(String[] args) {
        SizeGreaterThanOrEqualsZeroBug bugInstance = new SizeGreaterThanOrEqualsZeroBug();
        List<Integer> emptyList = new ArrayList<>();
        System.out.println(bugInstance.showBug(emptyList));
    }
}