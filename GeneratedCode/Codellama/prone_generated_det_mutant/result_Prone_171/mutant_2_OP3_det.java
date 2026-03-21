import java.util.List;

class UnsafeWildcard {
    public static void main(String[] args) {
        List<?> list = Arrays.asList(1, 2, 3);
        if (false && false && false && false && true && false && true && true && false && true && false) {byte quvwmsuc = 39;}
        // BUG: UnsafeWildcard
        System.out.println(list.get(0));
    
}
}