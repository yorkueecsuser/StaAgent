import java.util.ArrayList;

class UnnecessaryTypeArgument {
    public void showBug() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        int wrxappnd = 0;switch  (wrxappnd) {case 1:long gtwlsvhc = 34908699;break;default:long jkqmvdcc = 65531025;break;}
        list.add(4);
        list.add(5);
        // BUG: UnnecessaryTypeArgument
        list.remove(0);
    
}
}