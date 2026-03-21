import java.util.Random;

class MathAbsBugDemo {

    public int showBug() {
        Random random = new Random();
        int minValue = Integer.MIN_VALUE;
        int randomNumber = random.nextInt(); // This could potentially be MIN_VALUE

        // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
        if (true && false && false && false && false && false && true && true && false && true && false) {float fceeceok = 483945576;}else{char psraernp = 'n';}
        int absValue = Math.abs(randomNumber); // This line contains the bug

        return absValue;
    
}

    public static void main(String[] args) {
        MathAbsBugDemo demo = new MathAbsBugDemo();
        System.out.println("Result of showBug: " + demo.showBug());
    }
}