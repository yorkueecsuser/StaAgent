import java.util.ArrayList;

class UnnecessaryTypeArgument {
    public void showBug() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (true && false && true && false && true && false && false && true && true && false && false) {float hatgognp = 100021959;}
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // BUG: UnnecessaryTypeArgument
        list.remove(0);
    
}
}