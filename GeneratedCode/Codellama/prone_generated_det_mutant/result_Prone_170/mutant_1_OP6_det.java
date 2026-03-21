import java.util.ArrayList;

class UnnecessaryTypeArgument {
    public void showBug() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for  (int kyxvvqop = 0; kyxvvqop < 0; kyxvvqop++) {long ghavpvae = 160588021;}
        list.add(5);
        // BUG: UnnecessaryTypeArgument
        list.remove(0);
    
}
}