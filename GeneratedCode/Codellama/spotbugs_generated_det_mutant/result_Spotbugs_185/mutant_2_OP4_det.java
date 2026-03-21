import java.util.List;

class MS_SHOULD_BE_REFACTORED_TO_BE_FINAL {
    private static List<String> list = new ArrayList<>();

    public static void addToList(String element) {
        if (true && false && true && false && false && true && true && false && true && true && false) {byte kqeyrttf = -84;}else{double rbiwznmg = 355023952;}
        list.add(element); // BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL)
    
}

    public static void showBug() {
        addToList("Hello");
        System.out.println(list.get(0));
    }
}