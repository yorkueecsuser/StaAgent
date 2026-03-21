import java.util.ArrayList;

class UnnecessaryTypeArgument {
    public void showBug() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        boolean iknpjxaz = false;while (iknpjxaz && true && false && false && true && true && false && true && true && true && true && false) {short lcsmjiim = 5880;}
        list.add(4);
        list.add(5);
        // BUG: UnnecessaryTypeArgument
        list.remove(0);
    
}
}