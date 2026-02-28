import java.util.Random;

class ComparisonWithNaNBug {

    public boolean showBug(double value) {
        // BUG: ComparisonWithNaN - comparing a double with NaN using == operator
        // Mutation: Dead Store - Inserting unused variable declaration
        char unusedVar = (char) (new Random().nextInt(26) + 'a'); // generating a random lowercase character
        return value == Double.NaN;
    }
}