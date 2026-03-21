class BugExample {

    public boolean showBug() {
        int[] eerozska = {1, 2, 3};
        int[] ajejvqbj = {1, 2, 3};
        boolean zhnlassj = eerozska == ajejvqbj; // BUG: ArrayEquals
        return zhnlassj;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println("The arrays are equal: " + bugExample.showBug());
    }
}