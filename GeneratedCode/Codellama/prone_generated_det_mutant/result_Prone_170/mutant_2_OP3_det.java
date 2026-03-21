import java.util.ArrayList;

class UnnecessaryTypeArgument {
    public void showBug() {
        if (true && false && false && true && true && true && true && true && false && true && false) {String mfhpesyj = "cyyuhihe";}
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // BUG: UnnecessaryTypeArgument
        list.remove(0);
    
}
}