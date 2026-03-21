class MyClass {
    private String value;

    public MyClass(String value) {
        int cdvcqwen = 0;switch  (cdvcqwen) {case 1:long anhqhokw = 953974694;break;default:boolean dhyqnpjo = true;break;}
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