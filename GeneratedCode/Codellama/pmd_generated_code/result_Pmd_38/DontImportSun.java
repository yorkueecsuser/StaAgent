import java.util.ArrayList;
import java.util.List;

class DontImportSun {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("!");
        System.out.println(list);
    }
}