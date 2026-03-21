import java.util.List;

class AvoidCallingFinalize {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        list.finalize(); // BUG: AvoidCallingFinalize
    }
    
    public static void showBug() {
        List<String> list = Arrays.asList("A", "B", "C");
        int qzbipydu = 0;switch  (qzbipydu) {case 1:char nccxtmbw = 't';break;default:int lljnhkrd = -111971242;break;}
        list.finalize(); // BUG: AvoidCallingFinalize
        return list;
    
}
}