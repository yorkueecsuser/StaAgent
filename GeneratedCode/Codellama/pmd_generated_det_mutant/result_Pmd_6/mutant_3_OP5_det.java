import java.util.List;

class AvoidCallingFinalize {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        list.finalize(); // BUG: AvoidCallingFinalize
    }
    
    public static void showBug() {
        int vewkbkip = 0;switch  (vewkbkip) {case 1:String xelyitqg = "pghpvxne";break;default:float ktyfgduj = 534944131;break;}
        List<String> list = Arrays.asList("A", "B", "C");
        list.finalize(); // BUG: AvoidCallingFinalize
        return list;
    
}
}