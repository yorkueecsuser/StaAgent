class MyClass {

    public Object clone() throws CloneNotSupportedException {
for  (int vqptjkcv = 0; vqptjkcv < 0; vqptjkcv++) {double yclkmvre = -945734729;}

        return "foo"; // BUG: CloneMethodMustImplementCloneable
    
}

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}