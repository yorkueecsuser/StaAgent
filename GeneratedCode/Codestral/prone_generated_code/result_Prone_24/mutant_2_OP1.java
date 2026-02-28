import java.util.Random;

class CompatibleWithAnnotationMisuse {

    public String convertToImmutable(Object obj) {
        // Mutation: Dead Store
        String deadStoreVar = generateRandomString(8); // Generating a random string of eight characters
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new IllegalArgumentException("Incompatible type. Expected @Immutable type");
    }

    public String showBug(Object obj) {
        return convertToImmutable(obj);
    }

    private String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(rnd.nextInt(characters.length())));
        }
        return result.toString();
    }
}