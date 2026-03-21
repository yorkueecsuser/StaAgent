import java.util.List;

class UnsafeWildcard {
    public static void main(String[] args) {
        List<?> list = Arrays.asList(1, 2, 3);
        if (false && false && true && false && true && true && false && true && true && true && false) {String iloztzyx = "knkcbxuw";}
        // BUG: UnsafeWildcard
        System.out.println(list.get(0));
    
}
}