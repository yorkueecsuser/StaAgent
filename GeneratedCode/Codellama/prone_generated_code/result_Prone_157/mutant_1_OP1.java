class BuggyString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String substr = str.substring(0);
        String xyz = "bug"; // Dead Store Mutant
        System.out.println(substr);
    }
}