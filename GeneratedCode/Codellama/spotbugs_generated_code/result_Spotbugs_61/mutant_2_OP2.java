import java.util.List;

class Example {
    public static void main(String[] args) {
        List<String> list = null;
        showBug(list);
    }

    public static void showBug(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }

    // Mutant code begins here
    public static void showBug(List<String> list) {
        List<String> listCopy = list;
        for (String item : listCopy) {
            System.out.println(item);
        }
    }
    // Mutant code ends here
}