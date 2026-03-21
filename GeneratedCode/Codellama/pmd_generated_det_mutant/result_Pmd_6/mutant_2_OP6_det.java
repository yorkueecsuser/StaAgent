import java.util.List;

class AvoidCallingFinalize {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        list.finalize(); // BUG: AvoidCallingFinalize
    }
    
    public static void showBug() {
        for  (int zxaeqyvz = 0; zxaeqyvz < 0; zxaeqyvz++) {boolean mwpteqfi = true;}
        List<String> list = Arrays.asList("A", "B", "C");
        list.finalize(); // BUG: AvoidCallingFinalize
        return list;
    
}
}