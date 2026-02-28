class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        Integer x = flag? foo : null; // BUG: NullTernary
        System.out.println(x.intValue());

        // Unreachable switch statement mutation
        boolean isUnreachable = false;
        switch(foo) {
            case 1:
                isUnreachable = true;
                break;
            default:
                break;
        }
    }
}