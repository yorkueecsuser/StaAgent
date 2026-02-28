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

    // Unreachable switch statement mutant
    public void showBugMutant() {
        int value = getValue();
        switch(value) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                System.out.println("This code is unreachable");
                break;
        }
    }
}