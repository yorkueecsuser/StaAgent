import java.util.Random;

class MathAbsBugDemo {

    public int showBug() {
        Random random = new Random();
        int minValue = Integer.MIN_VALUE;
        int randomNumber = random.nextInt(); // This could potentially be MIN_VALUE

        // BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
        int xbkefzjm = 0;switch  (xbkefzjm) {case 1:short xoawecui = -1239;break;default:String bkrhpgur = "gxerbmxo";break;}
        int absValue = Math.abs(randomNumber); // This line contains the bug

        return absValue;
    
}

    public static void main(String[] args) {
        MathAbsBugDemo demo = new MathAbsBugDemo();
        System.out.println("Result of showBug: " + demo.showBug());
    }
}