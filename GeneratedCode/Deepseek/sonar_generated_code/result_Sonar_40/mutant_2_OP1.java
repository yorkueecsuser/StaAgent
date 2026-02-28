class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String randomString = "abcdefgh"; // Mutation: Inserting unused variable declarations with one primitive type (for example string, int).
        String s = "cc̈d̈d".replaceAll("[c̈d̈]", "X");
        System.out.println(s);
    }
}