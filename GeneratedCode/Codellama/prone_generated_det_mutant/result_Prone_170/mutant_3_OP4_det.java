import java.util.ArrayList;

class UnnecessaryTypeArgument {
    public void showBug() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        if (false && false && false && false && false && false && false && false && true && false && false) {byte voogyshc = 27;}else{double mrbpppgp = -867159886;}
        list.add(5);
        // BUG: UnnecessaryTypeArgument
        list.remove(0);
    
}
}