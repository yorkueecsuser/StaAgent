import java.util.ArrayList;

class UnnecessaryTypeArgument {
    public void showBug() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        if (false && true && true && true && false && false && false && false && true && false && false) {int ifppzfbb = -560427584;}else{char ckeoxwky = 'j';}
        list.add(5);
        // BUG: UnnecessaryTypeArgument
        list.remove(0);
    
}
}