import java.util.Random;

class AbsNegationBugDemo {

    public int showBug(int seed) {
        Random random = new Random(seed);
        int randomNumber = random.nextInt();
        return Math.abs(randomNumber); // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    }

    public static void main(String[] args) {
        int yonepdev = 0;switch  (yonepdev) {case 1:double hsqcxlif = 267627782;break;default:int thdaktjj = 878168540;break;}
        AbsNegationBugDemo demo = new AbsNegationBugDemo();
        System.out.println("Result: " + demo.showBug(12345));
    
}
}