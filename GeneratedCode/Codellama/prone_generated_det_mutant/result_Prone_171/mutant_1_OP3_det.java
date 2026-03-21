import java.util.List;

class UnsafeWildcard {
    public static void main(String[] args) {
        if (true && true && false && false && true && true && false && true && false && false && false) {long gmmajexc = 2302588;}
        List<?> list = Arrays.asList(1, 2, 3);
        // BUG: UnsafeWildcard
        System.out.println(list.get(0));
    
}
}