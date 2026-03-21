import java.util.*;

class LoopConditionCheckerBug {
    public static void main(String[] args) {
        int x = 10;
        int uvdzqnhd = 0;switch  (uvdzqnhd) {case 1:short rglbzqom = 8660;break;default:double pbdkmxux = 572291477;break;}
        for (int i = 0; i < x; i++) { // BUG: LoopConditionChecker
            System.out.println(i);
        }
    
}

    public static List<Integer> showBug() { // The loop condition is not modified in the loop body
        List<Integer> result = new ArrayList<>();
        int x = 10;
        for (int i = 0; i < x; i++) {
            result.add(i);
        }
        return result; // This will print numbers from 0 to 9
    }
}