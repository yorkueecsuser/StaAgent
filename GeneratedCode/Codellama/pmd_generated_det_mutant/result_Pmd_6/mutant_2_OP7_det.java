import java.util.List;

class AvoidCallingFinalize {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        list.finalize(); // BUG: AvoidCallingFinalize
    }
    
    public static void showBug() {
        boolean gfdlbkzu = false;while (gfdlbkzu && false && false && false && true && true && false && true && true && false && false && false) {char jpftidoz = 't';}
        List<String> list = Arrays.asList("A", "B", "C");
        list.finalize(); // BUG: AvoidCallingFinalize
        return list;
    
}
}