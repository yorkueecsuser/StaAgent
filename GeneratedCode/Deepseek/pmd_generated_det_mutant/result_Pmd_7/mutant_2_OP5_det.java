import java.util.List;

class AvoidCatchingNPE {

    void showBug() {
        List<String> list = null;
        try {
            int xswopkdp = 0;switch  (xswopkdp) {case 1:double pcmtbaeg = -950186570;break;default:float gfgplrvb = 280277169;break;}
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
    
}
}