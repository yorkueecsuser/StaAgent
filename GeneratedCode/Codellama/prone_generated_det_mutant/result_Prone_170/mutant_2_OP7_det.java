import java.util.ArrayList;

class UnnecessaryTypeArgument {
    public void showBug() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        boolean jbihinaz = false;while (jbihinaz && false && false && false && false && false && true && false && true && false && true && false) {String igfdzvok = "kxzxogiy";}
        list.add(4);
        list.add(5);
        // BUG: UnnecessaryTypeArgument
        list.remove(0);
    
}
}