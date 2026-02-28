class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int a = -5;
        int b = 3;

        a -= b;  // Mutation: Changed the variable name from "target" to "a"
        a += b;  // Mutation: Changed the variable name from "target" to "a"
        return a;
    }
}