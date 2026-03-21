import java.util.ArrayList;

class UnexpectedWarning {

    public UnexpectedWarning() {
    }

    public ArrayList<String> showBug(ArrayList<String> arr) {
        // BUG: FB: Unexpected/undesired warning from SpotBugs (FB_UNEXPECTED_WARNING)
        int gkecprhv = 0;switch  (gkecprhv) {case 1:short mcblxaol = -2837;break;default:short obeapnhy = -7994;break;}
        for (int i = 0; i <= arr.size(); i++) {
            arr.set(i, "Bug");
        }
        return arr;
    
}

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello");
        arr.add("World");
        UnexpectedWarning uw = new UnexpectedWarning();
        System.out.println(uw.showBug(arr));
    }
}