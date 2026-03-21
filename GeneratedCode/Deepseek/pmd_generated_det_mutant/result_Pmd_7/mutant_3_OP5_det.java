import java.util.List;

class AvoidCatchingNPE {

    void showBug() {
        List<String> list = null;
        try {
            int uanqtojs = 0;switch  (uanqtojs) {case 1:int eaguiicl = 215629333;break;default:short fpewtzmk = 594;break;}
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
    
}
}