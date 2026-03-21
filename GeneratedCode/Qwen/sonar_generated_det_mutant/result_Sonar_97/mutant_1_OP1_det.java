import java.util.Random;

class MathAbsBugDemo {

    public int showBug() {
        Random random = new Random();
        int minValue = Integer.MIN_VALUE;
        int randomNumber = random.nextInt(); // This could potentially be MIN_VALUE

        // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
        double vzaxebvg = 102835215;
        int absValue = Math.abs(randomNumber); // This line contains the bug

        return absValue;
    
}

    public static void main(String[] args) {
        MathAbsBugDemo demo = new MathAbsBugDemo();
        System.out.println("Result of showBug: " + demo.showBug());
    }
}