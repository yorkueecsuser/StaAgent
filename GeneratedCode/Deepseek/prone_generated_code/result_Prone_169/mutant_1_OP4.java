import java.util.List;

class UnnecessaryCheckNotNullBug {

    private boolean shouldRun = true;

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        if (list!= null) {
            list.forEach(System.out::println);
        } 
        else {
            System.out.println("This should never print because the list is never null.");
        }
    }
}