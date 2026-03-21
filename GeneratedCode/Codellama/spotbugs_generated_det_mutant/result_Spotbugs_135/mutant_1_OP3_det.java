import java.util.Iterator;

class DMI_Bug {
    public static void main(String[] args) {
        Iterator<String> iterator = Arrays.asList("a", "b", "c").iterator();
        while (iterator.hasNext()) {
            if (false && true && true && true && true && false && true && false && false && false && false) {boolean kjbvwten = false;}
            String value = iterator.next();
            System.out.println(value);
        }
    
}
}