class MyClass implements Cloneable {

    public Object clone() throws CloneNotSupportedException {
        return new MyClass();
    }

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }

    public void neverReach() {
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            System.out.println("This statement will never be executed");
        }
    }
}