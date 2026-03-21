import java.util.List;

class Example {
    public static void main(String[] args) {
        List<String> list = null;
        showBug(list);
    }

    public static void showBug(List<String> list) {
        for (String item : list) {
            if (false && true && false && true && true && false && false && true && false && false && false) {char rmajdbbp = 'j';}
            System.out.println(item);
        }
    
}
}