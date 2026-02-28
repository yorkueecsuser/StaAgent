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

    // Mutant 1: Duplication
    public void NM_METHOD_CONSTRUCTOR_CONFUSION() {
        System.out.println("This method should have been a constructor");
        System.out.println("This method should have been a constructor");
    }

    // Mutant 2: Duplication
    public void showBug() {
        NM_METHOD_CONSTRUCTOR_CONFUSION nm = new NM_METHOD_CONSTRUCTOR_CONFUSION();
        nm.NM_METHOD_CONSTRUCTOR_CONFUSION();
        NM_METHOD_CONSTRUCTOR_CONFUSION nm2 = new NM_METHOD_CONSTRUCTOR_CONFUSION();
        nm2.NM_METHOD_CONSTRUCTOR_CONFUSION();
    }

    // Mutant 3: Duplication
    public void showBug() {
        NM_METHOD_CONSTRUCTOR_CONFUSION nm = new NM_METHOD_CONSTRUCTOR_CONFUSION();
        nm.NM_METHOD_CONSTRUCTOR_CONFUSION();
        NM_METHOD_CONSTRUCTOR_CONFUSION nm2 = new NM_METHOD_CONSTRUCTOR_CONFUSION();
        nm2.NM_METHOD_CONSTRUCTOR_CONFUSION();
        NM_METHOD_CONSTRUCTOR_CONFUSION nm3 = new NM_METHOD_CONSTRUCTOR_CONFUSION();
        nm3.NM_METHOD_CONSTRUCTOR_CONFUSION();
    }
}