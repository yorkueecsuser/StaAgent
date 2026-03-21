
class MyClass {
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }
@ Override public boolean equals(Object obj){
    MyClass that =(MyClass)obj;
    that =(MyClass)obj;
    return this.id == that.id && this.name.equals(that.name);
}

    public static void showBug(Object obj) {
        MyClass myClass = new MyClass(1, "John");
        System.out.println(myClass.equals(obj));
    }
}