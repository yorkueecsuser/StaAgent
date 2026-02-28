class MisplacedNullCheckBug {
    private String a;
    private String baz;

    public void setA(String a) {
        this.a = a;
    }

    public void setBaz(String baz) {
        this.baz = baz;
    }

    public boolean showBug() {
        return a.equals(baz) && a!= null; // Original bug: MisplacedNullCheck
    }

    public void loopBug() {
        do {
            if (a.equals(baz) || a == null) { // Introduced bug: MisplacedNullCheck in a loop
                System.out.println("Bug in loop");
            }
            // loop body
        } while (true); // replace with actual loop condition
    }
}