class UselessStringBug {

    public String showBug() {
        String result = new int[] {1, 2, 3}.toString();
        return result;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}