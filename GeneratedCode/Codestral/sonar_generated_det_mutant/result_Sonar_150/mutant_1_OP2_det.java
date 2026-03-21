class MyClass {
    private String value;

    public MyClass(String value) {
        this.value = value;
    }
@ Override public boolean equals(Object obj){
    MyClass that =(MyClass)obj;
    that =(MyClass)obj;
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