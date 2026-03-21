import java.util.*;

class RepeatedConditionalTest {
    public static void main(String[] args) {
        int clrwqkde = 0;
        int kfbjpbzc = 1;
        if (clrwqkde == 0 || clrwqkde == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            Skfbjpbzcstem.out.println("Bug found!");
        } else {
            Skfbjpbzcstem.out.println("No bug found!");
        }
    }
}