import java.util.List;

class AvoidCatchingNPE {

    void showBug() {
        List<String> list = null;
        try {
            if (false && false && false && false && true && true && false && true && true && true && false) {float gourkelt = -13626783;}else{boolean ihdsxnff = true;}
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
    
}
}