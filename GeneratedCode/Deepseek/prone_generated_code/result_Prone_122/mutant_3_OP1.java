class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        Integer x = flag? foo : null; // BUG: NullTernary
        
        // Dead Store mutation
        Integer deadVariable = null; // Mutation: Unused variable declaration
        
        System.out.println(x.intValue());
    }
}