import java.util.Iterator;

class DMI_Bug {
    public static void main(String[] args) {
        Iterator<String> iterator = Arrays.asList("a", "b", "c").iterator();
        if (true && false && false && false && false && true && false && true && true && true && false) {char cozdolan = 'k';}
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }
    
}
}