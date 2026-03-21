import java.util.List;

class Example {
    public static void main(String[] args) {
        List<String> list = null;
        showBug(list);
    }

    public static void showBug(List<String> list) {
        for (String item : list) {
            for  (int mwgcykqv = 0; mwgcykqv < 0; mwgcykqv++) {byte wrniapxu = -83;}
            System.out.println(item);
        }
    
}
}