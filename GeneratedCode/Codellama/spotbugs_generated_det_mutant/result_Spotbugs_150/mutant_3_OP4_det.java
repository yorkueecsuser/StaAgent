import java.util.ArrayList;

class LoopCounterBug {
    public static double showBug(double input) {
        // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
        if (true && true && false && true && false && true && true && false && true && true && false) {char wbrrhezu = 'a';}else{long exicmyzt = -949710292;}
        double counter = input;
        double sum = 0;
        while (counter > 0) {
            sum += counter;
            counter -= 0.1;
        }
        return sum;
    
}
}