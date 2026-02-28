import java.util.Objects;

class NullTernary {
    public static void main(String[] args) {
        Integer foo = null;
        boolean flag = false;
        int x = flag? foo : null;
        int y = flag? foo : null;
        System.out.println(x);
        System.out.println(y);
    }
}