import java.util.Random;

class ConditionalExpressionNumericPromotionBug {

    public Object showBug1() {
        Object t = true? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        // Added dead store variable
        int deadStore = generateRandomNumber();
        return t;
    }

    public Object showBug2() {
        Object f = false? Double.valueOf(0) : Integer.valueOf(0); // BUG: ConditionalExpressionNumericPromotion
        // Added dead store variable
        String deadStore = generateRandomString();
        return f;
    }

    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }

    private String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 8;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
              (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        ConditionalExpressionNumericPromotionBug bug = new ConditionalExpressionNumericPromotionBug();
        System.out.println(bug.showBug1().getClass()); // prints: class java.lang.Double
        System.out.println(bug.showBug2().getClass()); // prints: class java.lang.Double
    }
}