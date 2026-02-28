// BUG: AddEmptyString

class BuggyCode {
    public static void main(String[] args) {
        int x = 5;
        String y = "" + x;
        System.out.println(y);
        String z = "kjhgfdsa"; // New variable declaration with a dead store
    }
}