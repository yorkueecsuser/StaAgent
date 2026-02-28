import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class SizeGreaterThanOrEqualsZeroBug {

    public boolean showBug(List<Integer> list) {
        int deadStoreVariable; // This line is the added dead store variable
        Random rand = new Random();
        deadStoreVariable = rand.nextInt(100); // Assigning a random value to the dead store variable
        return list.size() >= 0; // BUG: SizeGreaterThanOrEqualsZero
    }

    public static void main(String[] args) {
        SizeGreaterThanOrEqualsZeroBug bugInstance = new SizeGreaterThanOrEqualsZeroBug();
        List<Integer> emptyList = new ArrayList<>();
        System.out.println(bugInstance.showBug(emptyList)); // should print 'true' even for an empty list
    }
}