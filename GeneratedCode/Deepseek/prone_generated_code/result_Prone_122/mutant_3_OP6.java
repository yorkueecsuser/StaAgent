class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        Integer x = flag? foo : null; 
        System.out.println(x.intValue());

        // Mutant Code
        for(int i = 0; false; i++) {
            System.out.println("This code is unreachable");
        }
    }
}