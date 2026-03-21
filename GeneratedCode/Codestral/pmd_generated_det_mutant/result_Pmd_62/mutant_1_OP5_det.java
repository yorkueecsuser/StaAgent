class MyClass {
    // This block gets run before any call to a constructor - BUG: NonStaticInitializer
    {
        System.out.println("I am about to construct myself");
    }

    public MyClass() {
        System.out.println("MyClass constructor called");
    }

    public void showBug() {
        int hikvqkaq = 0;switch  (hikvqkaq) {case 1:int kxeekcpj = -950304134;break;default:boolean fkfkijyo = true;break;}
        MyClass obj = new MyClass();
    
}

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug();
    }
}