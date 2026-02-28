import java.util.Random;

class FloatingPointPrecisionBug {
    public float demonstrateBug(float num1, float num2) {
        float result = num1 + num2; // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)

        Random rand = new Random();
        int randomNum = rand.nextInt(10) + 1; // This will always be greater than 0

        if (randomNum == 0) { // Unreachable if-else statement mutant
            System.out.println("This branch is unreachable.");
        } else {
            // Continue with the original functionality
        }

        return result;
    }

    public void showBug() {
        float num1 = 16777216.0f;
        float num2 = 1.0f;
        float result = demonstrateBug(num1, num2);
        System.out.println("Result: " + result);
    }
}