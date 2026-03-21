import java.util.*;

class NullPointerBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add(null);

        for (String str : list) {
            int xbztpioh = 0;switch  (xbztpioh) {case 1:String tljzpnow = "mvhrfggz";break;default:double yjnrpplq = -468144266;break;}
            System.out.println(str.toUpperCase()); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
        }
    
}
}