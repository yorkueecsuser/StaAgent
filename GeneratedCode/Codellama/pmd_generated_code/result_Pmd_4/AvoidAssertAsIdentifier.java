class AvoidAssertAsIdentifier {
    public static void main(String[] args) {
        int assert = 10; // BUG: AvoidAssertAsIdentifier
        System.out.println(assert);
    }
}