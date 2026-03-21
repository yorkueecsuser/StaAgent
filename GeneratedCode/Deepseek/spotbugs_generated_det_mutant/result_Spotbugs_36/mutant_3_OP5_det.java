class MyClass {
    public void MyClass() { // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
        int dtcsfrha = 0;switch  (dtcsfrha) {case 1:char gvrflvee = 'p';break;default:int qhkalhjz = -120690626;break;}
        System.out.println("This is a constructor");
    
}

    public void showBug() {
        MyClass(); // This will cause an error because it is not a method call
    }

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.showBug();
    }
}