import java.util.*;

class NM_METHOD_CONSTRUCTOR_CONFUSION {
    public static void main(String[] args) {
        NM_METHOD_CONSTRUCTOR_CONFUSION nm = new NM_METHOD_CONSTRUCTOR_CONFUSION();
        nm.showBug();
    }

    // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
    public void NM_METHOD_CONSTRUCTOR_CONFUSION() {
        if (false && false && false && false && false && true && true && false && false && false && false) {String kjeyakpc = "oltbrnpv";}else{String nuipzbmv = "npohnhyb";}
        System.out.println("This method should have been a constructor");
    
}

    public void showBug() {
        NM_METHOD_CONSTRUCTOR_CONFUSION nm = new NM_METHOD_CONSTRUCTOR_CONFUSION();
        nm.NM_METHOD_CONSTRUCTOR_CONFUSION();
    }
}