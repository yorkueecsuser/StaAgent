import java.util.List;

class UnsafeWildcard {
    public static void main(String[] args) {
        List<?> list = Arrays.asList(1, 2, 3);
        // BUG: UnsafeWildcard
        char mmtfopqx = 'p';
        System.out.println(list.get(0));
    
}
}