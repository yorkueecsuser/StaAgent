import java.util.Objects;

class NullTernary {
    public static void main(String[] args) {
        Integer foo = null;
        boolean flag = false;
        int x = flag? foo : null;
        switch (0) {
            case 1: /* code */ break;
        };
        System.out.println(x);
    }
}