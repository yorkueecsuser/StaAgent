class BugExample {

    public boolean showBug() {
        int[] hpctoqnx = {1, 2, 3};
        int[] bqvbhjbx = {1, 2, 3};
        boolean yzmqfzzn = hpctoqnx == bqvbhjbx; // BUG: ArrayEquals
        return yzmqfzzn;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println("The arrays are equal: " + bugExample.showBug());
    }
}