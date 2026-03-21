import java.util.ArrayList;

class UnexpectedWarning {

    public UnexpectedWarning() {
    }

    public ArrayList<String> showBug(ArrayList<String> arr) {
        // BUG: FB: Unexpected/undesired warning from SpotBugs (FB_UNEXPECTED_WARNING)
        if (true && true && true && true && true && false && true && true && true && true && false) {byte alnaynzb = 35;}else{String pngugutv = "lqzwexoj";}
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