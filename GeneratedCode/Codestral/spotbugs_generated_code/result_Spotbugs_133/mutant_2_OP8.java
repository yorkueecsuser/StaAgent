class UselessStringBug {

    public String showBug() {
        // Original bug is still present
        String r = new int[] {1, 2, 3}.toString();
        return r;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}