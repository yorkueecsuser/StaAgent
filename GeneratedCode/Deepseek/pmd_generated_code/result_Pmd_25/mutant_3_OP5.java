class MyClass implements Cloneable {

    public Object clone() throws CloneNotSupportedException {
        return "foo";
    }

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }

    public void unreachableSwitch() {
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            default:
                System.out.println("This is an unreachable statement");
                break;
        }
    }

    private int getUnreachableValue() {
        return 0; // This value will never match any case in the switch statement
    }
}