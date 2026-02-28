import java.util.*;

class NM_METHOD_CONSTRUCTOR_CONFUSION {
    public static void main(String[] args) {
        NM_METHOD_CONSTRUCTOR_CONFUSION nm = new NM_METHOD_CONSTRUCTOR_CONFUSION();
        nm.showBug();
    }

    // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
    public void NM_METHOD_CONSTRUCTOR_CONFUSION() {
        System.out.println("This method should have been a constructor");
    }

    public void showBug() {
        NM_METHOD_CONSTRUCTOR_CONFUSION nm = new NM_METHOD_CONSTRUCTOR_CONFUSION();
        nm.NM_METHOD_CONSTRUCTOR_CONFUSION();
    }

    public void unreachableIfStatement(int x) {
        if (x == 10) {
            System.out.println("x is 10");
        } else if (x == 20) {
            System.out.println("x is 20");
        } else {
            System.out.println("x is neither 10 nor 20");
        }
    }
}