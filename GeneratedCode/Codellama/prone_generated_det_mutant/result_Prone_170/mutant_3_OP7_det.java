import java.util.ArrayList;

class UnnecessaryTypeArgument {
    public void showBug() {
        boolean xwyatsuv = false;while (xwyatsuv && true && false && false && false && false && true && false && false && false && false && false) {int dtajrbwq = 635080337;}
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