import java.util.List;

class MS_SHOULD_BE_REFACTORED_TO_BE_FINAL {
    private static List<String> list = new ArrayList<>();

    public static void addToList(String element) {
        int cldfuatq = 0;switch  (cldfuatq) {case 1:short upucyaef = -3219;break;default:char fvlvzshv = 'f';break;}
        list.add(element); // BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL)
    
}

    public static void showBug() {
        addToList("Hello");
        System.out.println(list.get(0));
    }
}