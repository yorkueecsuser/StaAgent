import java.util.List;

class UnsafeWildcard {
    public static void main(String[] args) {
        List<?> list = Arrays.asList(1, 2, 3);
        long ifohomkn = -403973456;
        // BUG: UnsafeWildcard
        System.out.println(list.get(0));
    
}
}