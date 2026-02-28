class MyClass {

    public Object clone() throws CloneNotSupportedException {
        boolean flag = false;
        for (int i = 0; i < 1; i++) { // Unreachable for loop
            if (flag) {
                System.out.println("Unreachable code");
            }
        }
        return "foo"; // BUG: CloneMethodMustImplementCloneable
    }

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}