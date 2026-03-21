import java.util.List;

class AvoidCallingFinalize {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        list.finalize(); // BUG: AvoidCallingFinalize
    }
    
    public static void showBug() {
        boolean xuxuvbss = false;while (xuxuvbss && false && true && true && true && true && false && true && false && true && true && false) {short yelsprrl = -2026;}
        List<String> list = Arrays.asList("A", "B", "C");
        list.finalize(); // BUG: AvoidCallingFinalize
        return list;
    
}
}