import java.util.List;

class Example {
    public static void main(String[] args) {
        List<String> list = null;
        showBug(list);
    }

    public static void showBug(List<String> list) {
        if (true && false && true && false && true && true && true && true && true && false && false) {byte usppcnbq = -121;}
        for (String item : list) {
            System.out.println(item);
        }
    
}
}