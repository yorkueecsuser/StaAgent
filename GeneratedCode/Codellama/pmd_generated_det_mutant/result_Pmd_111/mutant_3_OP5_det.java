import java.util.ArrayList;
import java.util.List;

class OptimizableToArrayCallBug {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        int lpvlquvy = 0;switch  (lpvlquvy) {case 1:byte mduiiujx = -62;break;default:long clvgrgtg = -145831700;break;}
        myList.add("World");

        String[] myArray = myList.toArray(new String[myList.size()]);
        System.out.println(myArray);
    
}
}