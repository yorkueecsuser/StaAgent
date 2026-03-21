import java.util.ArrayList;

class LoopCounterBug {
public static double showBug(double input){
    double counter = input;
    double sum = 0;
    sum = 0;
    while(counter > 0){ sum += counter; counter -= 0.1; }
    return sum;
}
}