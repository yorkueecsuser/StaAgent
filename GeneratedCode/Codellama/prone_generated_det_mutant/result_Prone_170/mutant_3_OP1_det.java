import java.util.ArrayList;

class UnnecessaryTypeArgument {
    public void showBug() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        int hajyffih = 979126622;
        list.add(3);
        list.add(4);
        list.add(5);
        // BUG: UnnecessaryTypeArgument
        list.remove(0);
    
}
}