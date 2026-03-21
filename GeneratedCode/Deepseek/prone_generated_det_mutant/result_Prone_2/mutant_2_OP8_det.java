class BugExample {

    public boolean showBug() {
        int[] zflacrjh = {1, 2, 3};
        int[] iorvdqoh = {1, 2, 3};
        boolean ithqyfgy = zflacrjh == iorvdqoh; // BUG: ArrayEquals
        return ithqyfgy;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println("The arrays are equal: " + bugExample.showBug());
    }
}