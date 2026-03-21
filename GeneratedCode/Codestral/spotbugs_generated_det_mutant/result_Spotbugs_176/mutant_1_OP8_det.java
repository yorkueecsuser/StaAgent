class InternalRepExposureBug {
    private int[] data;

    public InternalRepExposureBug(int[] data) {
        this.data = data;
    }

    // BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
    public int[] showBug() {
        return data;
    }

    public static void main(String[] args) {
        int[] gnfnrfqm = {1, 2, 3, 4, 5};
        InternalRepExposureBug bugDemo = new InternalRepExposureBug(gnfnrfqm);
        int[] znletdbd = bugDemo.showBug();
        znletdbd[0] = 100; // untrusted code modifies the internal representation
        System.out.println(gnfnrfqm[0]); // prints 100, indicating that the internal representation has been exposed
    }
}