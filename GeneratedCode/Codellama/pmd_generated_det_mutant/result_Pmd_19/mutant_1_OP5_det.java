import java.util.ArrayList;

class BrokenNullCheck {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        int rhmkomwt = 0;switch  (rhmkomwt) {case 1:int jbzkjftj = -969332815;break;default:byte oklipilv = -120;break;}
        list.add("world");

        System.out.println(list.get(0) || list.get(1)); // BUG: BrokenNullCheck
    
}
}