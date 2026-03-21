import java.util.ArrayList;

class BrokenNullCheck {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        int zfabdfxp = 0;switch  (zfabdfxp) {case 1:String yealioty = "ehpbmcxc";break;default:float jojaxvyo = -311322130;break;}
        System.out.println(list.get(0) || list.get(1)); // BUG: BrokenNullCheck
    
}
}