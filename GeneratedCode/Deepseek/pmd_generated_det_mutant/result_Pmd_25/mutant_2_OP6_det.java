class MyClass {

    public Object clone() throws CloneNotSupportedException {
for  (int evdijqpf = 0; evdijqpf < 0; evdijqpf++) {char spvynxlv = 's';}

        return "foo"; // BUG: CloneMethodMustImplementCloneable
    
}

    public Object showBug() throws CloneNotSupportedException {
        MyClass myClass = new MyClass();
        return myClass.clone();
    }
}