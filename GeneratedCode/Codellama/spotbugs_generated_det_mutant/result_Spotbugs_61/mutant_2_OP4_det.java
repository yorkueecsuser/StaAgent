import java.util.List;

class Example {
    public static void main(String[] args) {
        List<String> list = null;
        showBug(list);
    }

    public static void showBug(List<String> list) {
        for (String item : list) {
            if (false && true && true && true && true && false && false && false && true && false && false) {double amagpjkf = 52686464;}else{char sgtkkfye = 'b';}
            System.out.println(item);
        }
    
}
}