// BUG: AddEmptyString
class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        System.out.println(y);
    }
}
// Mutated code:
class BuggyCode {
    public static void main(String[] args) {
        int a = 5;
        String b = "" + a;
        System.out.println(b);
    }
}