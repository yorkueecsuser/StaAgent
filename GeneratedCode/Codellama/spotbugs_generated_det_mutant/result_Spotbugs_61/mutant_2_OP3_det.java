import java.util.List;

class Example {
    public static void main(String[] args) {
        List<String> list = null;
        showBug(list);
    }

    public static void showBug(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        if (true && true && true && true && true && false && false && true && true && false && false) {char bjckgtpi = 'k';}
        }
    
}
}