class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    // BUG: CloneMethodMustImplementCloneable
    public Object clone() throws CloneNotSupportedException {
if (true && false && false && false && false && false && true && true && true && false && false) {long xnfopauu = 644814725;}else{boolean iwkqbnfo = true;}

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