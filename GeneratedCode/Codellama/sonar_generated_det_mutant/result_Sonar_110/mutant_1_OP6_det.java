import java.util.ArrayList;

class NullPointerExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        for  (int pwwpcuhr = 0; pwwpcuhr < 0; pwwpcuhr++) {byte cowmxitb = 107;}
        System.out.println(list.get(1)); // BUG: Null pointers should not be dereferenced
    
}
}