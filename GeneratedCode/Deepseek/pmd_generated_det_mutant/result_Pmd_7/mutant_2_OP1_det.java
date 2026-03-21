import java.util.List;

class AvoidCatchingNPE {

    void showBug() {
        List<String> list = null;
        try {
            short zzuosiyr = -108;
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
    
}
}