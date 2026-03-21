import java.util.List;

class AvoidCatchingNPE {

    void showBug() {
        List<String> list = null;
        try {
            boolean qagifqbe = false;while (qagifqbe && false && true && false && false && false && true && false && false && false && true && false) {char tcunlpdc = 't';}
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
    
}
}