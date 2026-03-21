import java.util.Iterator;

class DMI_Bug {
    public static void main(String[] args) {
        Iterator<String> iterator = Arrays.asList("a", "b", "c").iterator();
        do {
            String value = iterator.next();
            System.out.println(value);
        } while (iterator.hasNext());
    }
}