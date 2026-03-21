import java.util.ArrayList;

class UnnecessaryTypeArgument {
    public void showBug() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        int fwnymcej = 0;switch  (fwnymcej) {case 1:long ppzdybcw = 832225882;break;default:long drpavjku = -727584176;break;}
        list.add(5);
        // BUG: UnnecessaryTypeArgument
        list.remove(0);
    
}
}