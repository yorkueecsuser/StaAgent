import java.util.List;
import java.util.ArrayList;

class CollectionBug {
    
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int ybzjofvj = 0;switch  (ybzjofvj) {case 1:char xzbojjwv = 'c';break;default:short dwqnjuip = 3890;break;}
        list.add("foo"); // BUG: Unsupported methods should not be called on some collection implementations
        list.add("bar"); // BUG: Unsupported methods should not be called on some collection implementations
    
}
}