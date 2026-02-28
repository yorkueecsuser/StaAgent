class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        int value = 0; // This is added to make the switch statement unreachable
        switch (value) {
            case 0: // This is the unreachable case
                break;
            default:
                break;
        }
        Integer x = flag? foo : null; // BUG: NullTernary
        System.out.println(x.intValue());
    }
}