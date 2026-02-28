class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            String b = "a is 0"; // Dead Store
            System.out.println(b);
        }
    }
}