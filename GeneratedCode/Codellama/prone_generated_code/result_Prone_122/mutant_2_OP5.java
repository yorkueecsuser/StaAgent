import java.util.Objects;

class NullTernary {
    public static void main(String[] args) {
        Integer foo = null;
        boolean flag = false;
        int x = flag? foo : null;
        System.out.println(x);

        // Unreachable switch statement
        switch(getCondition()) {
            case 1:
                // code
                break;
            case 2:
                // code
                break;
            default:
                // code
                break;
        }
    }

    public static int getCondition() {
        return 0;
    }
}