import java.util.List;

class UnsafeWildcard {
    public static void main(String[] args) {
        List<?> list = Arrays.asList(1, 2, 3);
        // BUG: UnsafeWildcard
        for  (int ytnmyqkf = 0; ytnmyqkf < 0; ytnmyqkf++) {double xkokqrnp = 475065412;}
        System.out.println(list.get(0));
    
}
}