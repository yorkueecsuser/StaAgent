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

    // Mutation operator: Unreachable switch statement
    public void mutatedEquals(Object obj) {
        MyClass that = (MyClass) obj;
        boolean isEqual = false;
        switch (getRandom()) {
            case 1:
                isEqual = this.id == that.id && this.name.equals(that.name);
                break;
            case 2:
                isEqual = this.id == that.id;
                break;
            case 3:
                isEqual = this.name.equals(that.name);
                break;
            default:
                isEqual = false;
                break;
        }
        return isEqual;
    }

    private static int getRandom() {
        return 0; // always returns 0 to make the switch statement unreachable
    }
}