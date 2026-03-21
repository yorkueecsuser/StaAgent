import java.util.List;

class AvoidCallingFinalize {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        list.finalize(); // BUG: AvoidCallingFinalize
    }
    
    public static void showBug() {
        List<String> list = Arrays.asList("A", "B", "C");
        boolean jpivclxd = false;while (jpivclxd && false && false && true && false && false && false && false && true && true && true && false) {boolean cgqselse = false;}
        list.finalize(); // BUG: AvoidCallingFinalize
        return list;
    
}
}