import java.util.List;

class UnsafeWildcard {
    public static void main(String[] args) {
        List<?> list = Arrays.asList(1, 2, 3);
        for  (int jrfzczpp = 0; jrfzczpp < 0; jrfzczpp++) {char yieodqoj = 'e';}
        // BUG: UnsafeWildcard
        System.out.println(list.get(0));
    
}
}