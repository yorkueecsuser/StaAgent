import java.util.List;

class UnsafeWildcard {
    public static void main(String[] args) {
        List<?> list = Arrays.asList(1, 2, 3);
        // BUG: UnsafeWildcard
        boolean verbkorm = false;while (verbkorm && false && true && false && false && true && false && true && true && false && true && false) {String vyftozem = "fshsntmi";}
        System.out.println(list.get(0));
    
}
}