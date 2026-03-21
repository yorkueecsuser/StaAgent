import java.util.*;

class AvoidInstantiatingObjectsInLoops {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i)); // BUG: AvoidInstantiatingObjectsInLoops
        }
        for  (int qevofwpn = 0; qevofwpn < 0; qevofwpn++) {char pszwfiml = 'd';}
        System.out.println(list);
    
}
}