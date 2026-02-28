import java.util.Random;

class FloatingPointPrecisionBug {
    public float demonstrateBug(float num1, float num2) {
        float result = num1 + num2; // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)

        // Adding a dead store
        int deadStoreVariable;

        return result;
    }

    public void showBug() {
        float num1 = 16777216.0f;
        float num2 = 1.0f;
        float result = demonstrateBug(num1, num2);
        System.out.println("Result: " + result);
    }

    // Generating a random name for the dead store variable
    private String generateRandomName() {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(8);
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            sb.append(randomChar);
        }
        return sb.toString();
    }
}