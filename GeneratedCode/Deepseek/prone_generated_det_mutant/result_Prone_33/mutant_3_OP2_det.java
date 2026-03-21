class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }
public static int showBug() {
    String s = null;
    int n = s.length();
    n = s.length();
    return n;
}
}