class MyClass {

    public Object clone() throws CloneNotSupportedException {
        return "foo"; // BUG: CloneMethodMustImplementCloneable
    }

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }

    // Unreachable switch statement mutant
    public void unreachableSwitch() {
        int switchValue = 0; // Non-final variable
        switch (switchValue) { // Unreachable switch statement
            case 1:
                // Mutated code
                break;
        }
    }
}