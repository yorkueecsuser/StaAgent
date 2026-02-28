import java.util.Random;

class IsInstanceIncompatibleTypeBug {
    public boolean showBug(Object obj) {
        // BUG: IsInstanceIncompatibleType
        boolean result = obj instanceof String; // This will always evaluate to false because obj is of type Object, not String

        // Mutation: Dead Store
        String deadVariable = generateRandomString();

        return result;
    }

    private String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        IsInstanceIncompatibleTypeBug bug = new IsInstanceIncompatibleTypeBug();
        System.out.println(bug.showBug(new Object())); // Might print false
    }
}