import java.util.List;

class UnnecessaryCheckNotNullBug {

    public void showBug(List<String> list) {
        if (list!= null) {
            list.forEach(System.out::println);
        }
    }

    public void mutatedCode(List<String> list) {
        boolean shouldRun = list.size() > 0;
        if (shouldRun) {
            list.forEach(System.out::println);
        } else {
            System.out.println("This branch should never be executed");
        }
    }
}