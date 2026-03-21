import java.util.ArrayList;

class BrokenNullCheck {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        int gwxsmkcx = 0;switch  (gwxsmkcx) {case 1:byte nvreffsf = 56;break;default:String snhocgev = "zxzftowm";break;}
        System.out.println(list.get(0) || list.get(1)); // BUG: BrokenNullCheck
    
}
}