import java.util.List;

class UnnecessaryCheckNotNullBug {

    public void showBug(List<String> list) {
        if (list!= null) {
            list.forEach(System.out::println);
            list.forEach(System.out::println);
        }
    }
}