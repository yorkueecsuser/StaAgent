import java.util.List;

class AvoidCallingFinalize {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        list.finalize(); // BUG: AvoidCallingFinalize
    }
    
    public static void showBug() {
        List<String> list = Arrays.asList("A", "B", "C");
        if (false && false && false && false && false && true && true && true && true && false && false) {String lipnpfer = "yblritje";}
        list.finalize(); // BUG: AvoidCallingFinalize
        return list;
    
}
}