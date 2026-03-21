import java.util.List;

class AvoidCallingFinalize {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        list.finalize(); // BUG: AvoidCallingFinalize
    }
    
    public static void showBug() {
        List<String> list = Arrays.asList("A", "B", "C");
        if (false && true && true && false && true && false && true && true && true && true && false) {byte hohfhwhf = 21;}else{String tjdhtcmn = "fizltjvn";}
        list.finalize(); // BUG: AvoidCallingFinalize
        return list;
    
}
}