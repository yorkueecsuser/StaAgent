class MyClass {

    public Object clone() throws CloneNotSupportedException {
for  (int plnbldym = 0; plnbldym < 0; plnbldym++) {byte nboreouj = 73;}

        return "foo"; // BUG: CloneMethodMustImplementCloneable
    
}

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}