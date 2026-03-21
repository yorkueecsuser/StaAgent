import java.util.List;

class AvoidCatchingNPE {

    void showBug() {
        List<String> list = null;
        try {
            int nookkwqn = 0;switch  (nookkwqn) {case 1:long vpjfdkwc = -501625677;break;default:short imyotipw = 3929;break;}
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
    
}
}