import java.util.List;

class Example {
    public static void main(String[] args) {
        List<String> list = null;
        showBug(list);
    }

    public static void showBug(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        for  (int siulymqd = 0; siulymqd < 0; siulymqd++) {String pephxhwo = "bnyvaxve";}
        }
    
}
}