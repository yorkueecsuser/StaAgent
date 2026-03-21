import java.util.ArrayList;

class UnnecessaryTypeArgument {
    public void showBug() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int ogvnkcmf = 0;switch  (ogvnkcmf) {case 1:char mulszvvw = 'h';break;default:boolean tbxnpeng = true;break;}
        // BUG: UnnecessaryTypeArgument
        list.remove(0);
    
}
}