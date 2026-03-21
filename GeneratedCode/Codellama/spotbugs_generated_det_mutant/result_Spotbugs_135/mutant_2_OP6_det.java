import java.util.Iterator;

class DMI_Bug {
    public static void main(String[] args) {
        Iterator<String> iterator = Arrays.asList("a", "b", "c").iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            for  (int umhumivq = 0; umhumivq < 0; umhumivq++) {char baiqtjiw = 'y';}
            System.out.println(value);
        }
    
}
}