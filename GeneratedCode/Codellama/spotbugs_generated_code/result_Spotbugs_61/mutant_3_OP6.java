import java.util.List;

class Example {
    public static void main(String[] args) {
        List<String> list = null;
        showBug(list);
    }

    public static void showBug(List<String> list) {
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }
    }
}