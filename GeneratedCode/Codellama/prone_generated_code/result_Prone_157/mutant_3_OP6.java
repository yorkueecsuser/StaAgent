// Unreachable for loop mutant
class BuggyString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String substr = str.substring(0);
        System.out.println(substr);

        // Inserted unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // Never reachable code
            System.out.println("This is unreachable code");
        }
    }
}