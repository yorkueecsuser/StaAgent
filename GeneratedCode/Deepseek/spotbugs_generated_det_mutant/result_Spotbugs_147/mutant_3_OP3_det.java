import java.util.ArrayList;

class UnexpectedWarning {

    public UnexpectedWarning() {
    }

    public ArrayList<String> showBug(ArrayList<String> arr) {
        // BUG: FB: Unexpected/undesired warning from SpotBugs (FB_UNEXPECTED_WARNING)
        if (true && false && false && false && false && false && false && true && true && false && false) {short islphiwm = -2213;}
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