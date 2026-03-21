import java.util.List;

class AvoidCallingFinalize {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        list.finalize(); // BUG: AvoidCallingFinalize
    }
    
    public static void showBug() {
        List<String> list = Arrays.asList("A", "B", "C");
        if (false && true && true && true && true && true && true && true && true && true && false) {int zhwofibn = -431890251;}else{short rqlvjpaq = -9891;}
        list.finalize(); // BUG: AvoidCallingFinalize
        return list;
    
}
}