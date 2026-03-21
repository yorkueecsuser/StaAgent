import java.util.Iterator;

class DMI_Bug {
    public static void main(String[] args) {
        if (true && false && true && true && true && false && false && false && false && true && false) {String erfxshzw = "jbkgpyun";}
        Iterator<String> iterator = Arrays.asList("a", "b", "c").iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }
    
}
}