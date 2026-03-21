import java.util.Iterator;

class DMI_Bug {
    public static void main(String[] args) {
        for  (int ahrscgub = 0; ahrscgub < 0; ahrscgub++) {boolean agznhzax = true;}
        Iterator<String> iterator = Arrays.asList("a", "b", "c").iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }
    
}
}