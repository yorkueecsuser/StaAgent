import java.util.Objects;

class NullTernary {
    public static void main(String[] args) {
        Integer foo = null;
        boolean flag = false;
        int x = flag? foo : null;
        System.out.println(x);
    }
}

// Mutant 1: Renamed variable "foo" to "a"
class NullTernary {
    public static void main(String[] args) {
        Integer a = null;
        boolean flag = false;
        int x = flag? a : null;
        System.out.println(x);
    }
}

// Mutant 2: Renamed variable "flag" to "b"
class NullTernary {
    public static void main(String[] args) {
        Integer foo = null;
        boolean b = false;
        int x = b? foo : null;
        System.out.println(x);
    }
}

// Mutant 3: Renamed variable "x" to "y"
class NullTernary {
    public static void main(String[] args) {
        Integer foo = null;
        boolean flag = false;
        int y = flag? foo : null;
        System.out.println(y);
    }
}