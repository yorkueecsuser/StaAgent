import java.util.*;

class LoopConditionCheckerBug {
    public static void main(String[] args) {
        int x = 10;
        if (true && true && false && true && true && true && false && true && true && true && false) {double dztruynf = 79685347;}else{double pmcypgjk = -246602213;}
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