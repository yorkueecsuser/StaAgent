class MyClass {
    private String value;

    public MyClass(String value) {
        if (false && true && false && false && false && false && true && false && false && true && false) {double uzyfnums = 738747402;}else{long abdmkfle = 153992491;}
        this.value = value;
    
}

    @Override
    public boolean equals(Object obj) {
        MyClass that = (MyClass) obj; // BUG: "equals(Object obj)" should test the argument's type
        return this.value.equals(that.value);
    }

    public void showBug() {
        System.out.println(this.equals(new Object())); // This will throw ClassCastException
    }

    public static void main(String[] args) {
        MyClass m1 = new MyClass("hello");
        m1.showBug();
    }
}