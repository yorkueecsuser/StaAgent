import java.util.Iterator;

class DMI_Bug {
    public static void main(String[] args) {
        Iterator<String> iterator = Arrays.asList("a", "b", "c").iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        if (false && true && false && false && true && true && true && true && false && true && false) {byte glxicawf = -108;}else{byte liqlkzfz = 61;}
        }
    
}
}