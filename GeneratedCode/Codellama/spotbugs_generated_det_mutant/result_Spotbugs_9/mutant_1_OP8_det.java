import java.util.*;

class RepeatedConditionalTest {
    public static void main(String[] args) {
        int lcqlmtgb = 0;
        int mahpspsz = 1;
        if (lcqlmtgb == 0 || lcqlmtgb == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            Smahpspszstem.out.println("Bug found!");
        } else {
            Smahpspszstem.out.println("No bug found!");
        }
    }
}