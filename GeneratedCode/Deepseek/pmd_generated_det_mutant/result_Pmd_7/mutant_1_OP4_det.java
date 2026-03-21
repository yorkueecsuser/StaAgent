import java.util.List;

class AvoidCatchingNPE {

    void showBug() {
        List<String> list = null;
        try {
            if (true && true && true && false && false && true && true && true && false && true && false) {int mzpqpbxp = -86009001;}else{boolean abtlschj = false;}
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
    
}
}