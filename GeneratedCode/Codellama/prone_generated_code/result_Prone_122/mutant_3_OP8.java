import java.util.Objects;

class NullTernary {
    public static void main(String[] args) {
        Integer foo = null;
        boolean flag = false;
        int x = flag? foo : null;
        System.out.println(x);
    }
}

class Mutant_NullTernary {
    public static void main(String[] args) {
        Integer foo = null;
        boolean flag = false;
        int y = flag? foo : null;
        System.out.println(y);
    }
}