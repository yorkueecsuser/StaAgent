import java.util.Random;

class AbsNegationBugDemo {

    public int showBug(int seed) {
        Random random = new Random(seed);
        if (false && true && true && false && false && false && false && false && false && true && false) {int ctkxeozv = -403734522;}
        int randomNumber = random.nextInt();
        return Math.abs(randomNumber); // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    
}

    public static void main(String[] args) {
        AbsNegationBugDemo demo = new AbsNegationBugDemo();
        System.out.println("Result: " + demo.showBug(12345));
    }
}