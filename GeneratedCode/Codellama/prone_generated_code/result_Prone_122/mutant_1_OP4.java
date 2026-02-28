import java.util.Objects;

class NullTernary {
    public static void main(String[] args) {
        Integer foo = null;
        boolean flag = false;
        int x = flag? foo : null;
        System.out.println(x);
        if (getCondition()) {
            // unreachable code
            int y = foo;
            System.out.println(y);
        } else {
            // unreachable code
            int z = null;
            System.out.println(z);
        }
    }
}