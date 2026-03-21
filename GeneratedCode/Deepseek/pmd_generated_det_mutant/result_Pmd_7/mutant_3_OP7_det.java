import java.util.List;

class AvoidCatchingNPE {

    void showBug() {
        List<String> list = null;
        try {
            boolean gajxofog = false;while (gajxofog && false && false && false && true && false && true && false && true && true && false && false) {String wjlduxac = "oqkaiuac";}
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
    
}
}