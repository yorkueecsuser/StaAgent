import java.util.ArrayList;

class UnexpectedWarning {

    public UnexpectedWarning() {
    }

    public ArrayList<String> showBug(ArrayList<String> arr) {
        // BUG: FB: Unexpected/undesired warning from SpotBugs (FB_UNEXPECTED_WARNING)
        boolean jiproftv = false;while (jiproftv && false && true && false && false && false && false && true && true && false && true && false) {double incuwguw = 169380174;}
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