import java.util.*;

class RepeatedConditionalTest {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        if (x == 0 || x == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            System.out.println("Bug found!");
        } else {
            System.out.println("No bug found!");
        }
    }
}

// Renaming mutant 1:
class RepeatedConditionalTest {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        if (a == 0 || a == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            System.out.println("Bug found!");
        } else {
            System.out.println("No bug found!");
        }
    }
}

// Renaming mutant 2:
class RepeatedConditionalTest {
    public static void main(String[] args) {
        int c = 0;
        int d = 1;
        if (c == 0 || c == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            System.out.println("Bug found!");
        } else {
            System.out.println("No bug found!");
        }
    }
}

// Renaming mutant 3:
class RepeatedConditionalTest {
    public static void main(String[] args) {
        int e = 0;
        int f = 1;
        if (e == 0 || e == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            System.out.println("Bug found!");
        } else {
            System.out.println("No bug found!");
        }
    }
}

// Renaming mutant 4:
class RepeatedConditionalTest {
    public static void main(String[] args) {
        int g = 0;
        int h = 1;
        if (g == 0 || g == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            System.out.println("Bug found!");
        } else {
            System.out.println("No bug found!");
        }
    }
}

// Renaming mutant 5:
class RepeatedConditionalTest {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        if (i == 0 || i == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            System.out.println("Bug found!");
        } else {
            System.out.println("No bug found!");
        }
    }
}

// Renaming mutant 6:
class RepeatedConditionalTest {
    public static void main(String[] args) {
        int k = 0;
        int l = 1;
        if (k == 0 || k == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            System.out.println("Bug found!");
        } else {
            System.out.println("No bug found!");
        }
    }
}

// Renaming mutant 7:
class RepeatedConditionalTest {
    public static void main(String[] args) {
        int m = 0;
        int n = 1;
        if (m == 0 || m == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            System.out.println("Bug found!");
        } else {
            System.out.println("No bug found!");
        }
    }
}

// Renaming mutant 8:
class RepeatedConditionalTest {
    public static void main(String[] args) {
        int o = 0;
        int p = 1;
        if (o == 0 || o == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            System.out.println("Bug found!");
        } else {
            System.out.println("No bug found!");
        }
    }
}

// Renaming mutant 9:
class RepeatedConditionalTest {
    public static void main(String[] args) {
        int q = 0;
        int r = 1;
        if (q == 0 || q == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            System.out.println("Bug found!");
        } else {
            System.out.println("No bug found!");
        }
    }
}

// Renaming mutant 10:
class RepeatedConditionalTest {
    public static void main(String[] args) {
        int s = 0;
        int t = 1;
        if (s == 0 || s == 0) { // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
            System.out.println("Bug found!");
        } else {
            System.out.println("No bug found!");
        }
    }
}