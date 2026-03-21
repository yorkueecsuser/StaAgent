class MyClass {

    public Object clone() throws CloneNotSupportedException {
double ldpgoepv = -350005166;

        return "foo"; // BUG: CloneMethodMustImplementCloneable
    
}

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}