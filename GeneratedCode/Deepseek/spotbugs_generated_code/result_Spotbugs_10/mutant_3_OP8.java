import java.util.Random;

class FloatingPointPrecisionBug {
    public float demonstrateBug(float nbr1, float nbr2) {
        float result = nbr1 + nbr2; // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
        return result;
    }

    public void showBug() {
        float nbr1 = 16777216.0f;
        float nbr2 = 1.0f;
        float rslt = demonstrateBug(nbr1, nbr2); // Mutated: rslt is a new name for the variable that stores the result
        System.out.println("Result: " + rslt);
    }

    // Mutant code: Adding a method that uses the renamed variable 'rslt'
    public void unusedMethod() {
        Random rand = new Random();
        float rslt = rand.nextFloat(); // Using the renamed variable 'rslt' in a new context
        System.out.println("Random number: " + rslt);
    }
}