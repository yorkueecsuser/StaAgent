import java.util.List;

class UnnecessaryCheckNotNullBug {

    // BUG: UnnecessaryCheckNotNull
    public void showBug(List<String> list) {
        if (list!= null) {
            list.forEach(System.out::println);
        }
    }

    // Mutated Java code
    public void mutatedShowBug(List<String> renamedList) {
        if (renamedList!= null) {
            renamedList.forEach(System.out::println);
        }
    }
}