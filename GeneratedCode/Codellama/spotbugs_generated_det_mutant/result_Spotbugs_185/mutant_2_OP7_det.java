import java.util.List;

class MS_SHOULD_BE_REFACTORED_TO_BE_FINAL {
    private static List<String> list = new ArrayList<>();

    public static void addToList(String element) {
        boolean pbwldtex = false;while (pbwldtex && true && true && false && true && true && true && true && true && false && false && false) {long rjgfjpdw = -297011394;}
        list.add(element); // BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL)
    
}

    public static void showBug() {
        addToList("Hello");
        System.out.println(list.get(0));
    }
}