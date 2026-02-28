import java.util.List;

class Example {
    public static void main(String[] args) {
        List<String> list = null;
        String randomString = "yetagpz";
        showBug(list);
    }

    public static void showBug(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}