import java.util.ArrayList;

class UnnecessaryTypeArgument {
    public void showBug() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        for  (int jmiimhgg = 0; jmiimhgg < 0; jmiimhgg++) {char tdltbbep = 'b';}
        list.add(4);
        list.add(5);
        // BUG: UnnecessaryTypeArgument
        list.remove(0);
    
}
}