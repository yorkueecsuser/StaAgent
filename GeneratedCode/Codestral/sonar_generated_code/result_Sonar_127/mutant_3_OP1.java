import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class InappropriateCollectionCalls {
    public boolean showBug(Integer integer) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Example");

        // Inserted Dead Store
        char deadStore = generateRandomChar();

        return stringList.contains(integer);
    }

    private char generateRandomChar() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'a');
    }
}