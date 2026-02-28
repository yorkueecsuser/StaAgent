import java.util.Random;

class StringConcatenationBug {

    // Method to demonstrate the bug
    public String showBug() {
        String result = "";
        Random rand = new Random();
        String unusedVariable = "a" + rand.nextInt(10000);
        for (int i = 0; i < 10; i++) {
            // BUG: UseStringBufferForStringAppends
            // The use of the '+=' operator for appending strings causes the JVM to create and use an internal StringBuffer.
            result += getStringFromSomeWhere(i);
        }
        return result;
    }

    // A placeholder method for retrieving a string
    private String getStringFromSomeWhere(int i) {
        return "String" + i;
    }
}