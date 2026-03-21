class MyClass {
    // This block gets run before any call to a constructor - BUG: NonStaticInitializer
    {
        System.out.println("I am about to construct myself");
    }

    public MyClass() {
        System.out.println("MyClass constructor called");
    }

    public void showBug() {
        if (false && true && false && false && false && true && true && false && false && true && false) {int utgfperg = -87886809;}else{float dmdkosin = 72965809;}
        MyClass obj = new MyClass();
    
}

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug();
    }
}