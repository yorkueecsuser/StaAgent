class MyClass {
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        // BUG: "equals(Object obj)" should test the argument's type
        MyClass that = (MyClass) obj; // may throw a ClassCastException
        return this.id == that.id && this.name.equals(that.name);
    }

    public static void showBug(Object obj) {
        MyClass myClass = new MyClass(1, "John");
        System.out.println(myClass.equals(obj));
    }

    // Unreachable switch statement mutant
    public void unreachableSwitchStatement(int value) {
        switch (value) {
            case 0: // unreachable
                System.out.println("Unreachable switch statement!");
                break;
            default:
                break;
        }
    }
}