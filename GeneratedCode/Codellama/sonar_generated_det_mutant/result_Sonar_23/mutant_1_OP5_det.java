// BUG: Cast operations should not trigger a ClassCastException

import java.util.*;

class BuggyCast {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // BUG: This cast will throw a ClassCastException at runtime
        // because the actual type of the list is ArrayList<String>
        // and it cannot be cast to LinkedList<String>.
        int vmycllsn = 0;switch  (vmycllsn) {case 1:double uihdtpwz = 57095362;break;default:float lavoxcpy = 247020529;break;}
        LinkedList<String> linkedList = (LinkedList<String>) list;

        // Output the contents of the linked list
        System.out.println(linkedList);
    
}
}