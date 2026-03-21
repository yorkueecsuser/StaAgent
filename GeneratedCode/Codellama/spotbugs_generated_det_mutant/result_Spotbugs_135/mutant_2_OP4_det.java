import java.util.Iterator;

class DMI_Bug {
    public static void main(String[] args) {
        Iterator<String> iterator = Arrays.asList("a", "b", "c").iterator();
        if (true && false && true && false && true && true && false && true && false && true && false) {int tfyjyfnn = -806725483;}else{long tveqzfdm = -510299888;}
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }
    
}
}