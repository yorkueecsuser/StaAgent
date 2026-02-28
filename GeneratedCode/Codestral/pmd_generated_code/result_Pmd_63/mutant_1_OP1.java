import java.util.Random;

class NullAssignmentBug {
    private Object myObject;

    public void initializeObject() {
        myObject = new Object();
    }

    public void demonstrateBug() {
        // Assume some complex operation here
        //...

        // BUG: NullAssignment
        // Assigning null to the object variable, which is usually not a good practice
        myObject = null;

        // Dead Store Mutation
        // Generating a random string of 8 characters
        String randomString = generateRandomString(8);
        // Declare and assign a dead store variable
        int deadStoreVariable = 0;  // This variable is declared but not used, a dead store

        // Assume some complex operation here
        //...
    }

    private String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(rand.nextInt(characters.length())));
        }
        return result.toString();
    }

    public Object showBug() {
        initializeObject();
        demonstrateBug();
        return myObject;
    }
}