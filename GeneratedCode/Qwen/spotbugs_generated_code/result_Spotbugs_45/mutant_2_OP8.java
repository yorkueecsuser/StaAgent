class NullFieldExample {

    private String nullableField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public NullFieldExample() {
        this.nullableField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
    }

    public String showBug() {
        return nullableField; // This will always return null due to the bug
    }

    public static void main(String[] args) {
        NullFieldExample example = new NullFieldExample();
        System.out.println("The value of nullableField is: " + example.showBug());
    }

    // Mutated code starts here
    private int a = 0;
    private boolean b = true;

    public void methodA() {
        int c = 5;
        b = false;
        System.out.println("Value of c: " + c);
    }

    public boolean methodB() {
        a = 10;
        return b;
    }
}