import java.util.Random;

class EqualsNaNBug {
    public boolean showBug(double num) {
        char unusedVar = randomChar(); // Dead Store
        return num == Double.NaN; // BUG: EqualsNaN
    }

    private char randomChar() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'a');
    }

    public static void main(String[] args) {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        System.out.println("Result: " + result);
    }
}