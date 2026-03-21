import java.util.ArrayList;

class UnnecessaryTypeArgument {
    public void showBug() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        if (true && false && true && true && true && false && false && true && true && true && false) {byte puwarkhc = 101;}else{short zeieupdl = 5348;}
        list.add(3);
        list.add(4);
        list.add(5);
        // BUG: UnnecessaryTypeArgument
        list.remove(0);
    
}
}