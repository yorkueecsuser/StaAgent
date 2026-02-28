import java.util.Objects;

class NullTernary {
    public static void main(String[] args) {
        Integer foo = null;
        boolean flag = false;
        int x = flag? foo : null;
        System.out.println(x);

//Begin Mutation

        for (int i = 0; false; i++) {
            System.out.println("This loop is unreachable");
        }

//End Mutation

        System.out.println(x);
    }
}