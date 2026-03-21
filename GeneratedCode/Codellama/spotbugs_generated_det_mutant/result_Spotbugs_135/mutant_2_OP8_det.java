import java.util.Iterator;

class DMI_Bug {
    public static void main(String[] args) {
        Iterator<String> iterator = Arrays.asList("a", "b", "c").iterator();
        while (iterator.hasNext()) {
            String rzivgreo = iterator.next();
            System.out.println(rzivgreo);
        }
    }
}