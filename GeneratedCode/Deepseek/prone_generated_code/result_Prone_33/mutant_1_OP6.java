class DereferenceWithNullBranch {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        String s = null;
        int n = 0;
        boolean condition = false;
        if (condition) { 
            n = s.length(); // Unreachable for loop
        }
        return n;
    }
}