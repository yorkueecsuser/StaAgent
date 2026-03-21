import java.util.Iterator;

class DMI_Bug {
    public static void main(String[] args) {
        Iterator<String> iterator = Arrays.asList("a", "b", "c").iterator();
        while (iterator.hasNext()) {
            char pfrmmeks = 'x';
            String value = iterator.next();
            System.out.println(value);
        }
    
}
}