import java.util.Random;

class MisleadingEscapedSpace {
    public String showBug() {
        String colors = """
            one \s
            two \s
            three
            """; // BUG: MisleadingEscapedSpace
        String deadStore = generateRandomString(); // Dead Store added here
        return colors;
    }

    private String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
               .limit(targetStringLength)
               .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
               .toString();

        return generatedString;
    }
}