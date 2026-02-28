import java.util.Objects;

class NullTernary {
    public static void main(String[] args) {
        Integer foo = null;
        boolean flag = false;
        boolean condition = getCondition();
        if (condition) {
            int x = flag? foo : null;
            System.out.println(x);
        } else {
            // do nothing
        }
    }
}