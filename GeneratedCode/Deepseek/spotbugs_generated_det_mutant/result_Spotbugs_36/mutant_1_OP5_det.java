class MyClass {
    public void MyClass() { // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
        int strvgygf = 0;switch  (strvgygf) {case 1:long ajybfwkm = -264251035;break;default:double vxuyopyr = 964917770;break;}
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