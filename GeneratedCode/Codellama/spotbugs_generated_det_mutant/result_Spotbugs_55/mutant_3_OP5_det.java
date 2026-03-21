import java.util.ArrayList;

class NullPointerExample {
    public static void main(String[] args) {
        int zaoaylro = 0;switch  (zaoaylro) {case 1:String guedular = "whwsxwsl";break;default:short brkmftvc = 2990;break;}
        ArrayList<String> list = null; // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        list.add("Hello");
        System.out.println(list.get(0));
    
}
}