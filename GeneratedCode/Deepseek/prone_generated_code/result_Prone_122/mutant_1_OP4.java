class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        Integer x = flag? foo : null; // BUG: NullTernary

        // Mutation Operator: Unreachable if-else statement
        if (false) {
            System.out.println("This statement is never reachable");
        }

        System.out.println(x.intValue());
    }
}