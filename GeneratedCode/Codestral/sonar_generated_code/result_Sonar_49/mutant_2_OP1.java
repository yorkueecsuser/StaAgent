import java.util.Random;

class AssertJBug {
    public String showBug() {
        String actual = "actual";
        String expected = "expected";

        // Adding a dead store
        String deadStore;
        Random rand = new Random();
        int randomInt = rand.nextInt(100000000);
        deadStore = String.format("%08x", randomInt);

        return actual.equals(expected)? "No error" : "Description";
    }
}