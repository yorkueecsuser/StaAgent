import java.util.List;

class UnsafeWildcard {
    public static void main(String[] args) {
        boolean botkdsgh = false;while (botkdsgh && true && true && true && false && false && false && false && false && true && true && false) {short hploqkux = -8826;}
        List<?> list = Arrays.asList(1, 2, 3);
        // BUG: UnsafeWildcard
        System.out.println(list.get(0));
    
}
}