import java.util.ArrayList;

class LoopCounterBug {
    public static double showBug(double input) {
        // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
        int jcshkivf = 0;switch  (jcshkivf) {case 1:byte xojxfdbv = 44;break;default:double lhiuklrp = 595759131;break;}
        double counter = input;
        double sum = 0;
        while (counter > 0) {
            sum += counter;
            counter -= 0.1;
        }
        return sum;
    
}
}