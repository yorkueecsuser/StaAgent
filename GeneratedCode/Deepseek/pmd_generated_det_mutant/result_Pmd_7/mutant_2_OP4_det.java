import java.util.List;

class AvoidCatchingNPE {

    void showBug() {
        List<String> list = null;
        try {
            if (true && false && false && true && false && false && false && true && true && true && false) {long xfqznfif = 308048035;}else{char rpgptftf = 'j';}
            list.size(); // BUG: AvoidCatchingNPE
        } catch (NullPointerException npe) {
            System.out.println("Caught NullPointerException");
        }
    
}
}