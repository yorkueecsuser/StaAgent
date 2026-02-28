import java.util.Random;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int target = -5;
        int num = 3;
        String randomString = generateRandomString();

        target =- num;
        target =+ num;
        return target;
    }

    private static String generateRandomString() {
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