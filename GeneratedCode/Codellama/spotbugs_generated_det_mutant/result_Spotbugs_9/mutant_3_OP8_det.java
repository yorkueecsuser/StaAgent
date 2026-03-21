import java.util.*;

class RepeatedConditionalTest {
    public static void main(String[] args) {
        int lcvimkeuiwxcima = 0;
        int uiwxcima = 1;
        if (lcvimkeuiwxcima == 0 || lcvimkeuiwxcima == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            Suiwxcimastem.out.println("Bug found!");
        } else {
            Suiwxcimastem.out.println("No bug found!");
        }
    }
}