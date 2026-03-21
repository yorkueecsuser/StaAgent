import java.util.List;

class AvoidCatchingNPE {

    void showBug() {
        List<String> list = null;
        try {
            for  (int wnoebval = 0; wnoebval < 0; wnoebval++) {String vxkfddyh = "ufmatuts";}
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
    
}
}