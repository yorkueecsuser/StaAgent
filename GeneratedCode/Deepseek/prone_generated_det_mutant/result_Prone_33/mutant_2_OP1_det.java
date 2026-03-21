class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        boolean ryxmqskg = false;
        int n = s.length(); // BUG: DereferenceWithNullBranch
        return n;
    
}
}