import java.util.ArrayList;

class UnnecessaryTypeArgument {
    public void showBug() {
        for  (int rqanfrig = 0; rqanfrig < 0; rqanfrig++) {float pcrlbgxm = -580611620;}
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