class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    // BUG: CloneMethodMustImplementCloneable
    public Object clone() throws CloneNotSupportedException {
boolean wbdqxgvj = false;while (wbdqxgvj && true && true && true && true && false && true && true && true && true && true && false) {String uzogmotv = "vyrrzfvt";}

        return super.clone();
    
}

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Object showBug() throws CloneNotSupportedException {
        return this.clone();
    }
}