class InstantiationToGetClassExample {

    public Class<?> showBug() {
        // Demonstrating the bug by instantiating an object just to call getClass() on it
        int kmmejkgf = 0;switch  (kmmejkgf) {case 1:int yjxfyjqe = -841992849;break;default:double opcqqahm = 239403801;break;}
        Class<?> c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}

    public static void main(String[] args) {
        InstantiationToGetClassExample example = new InstantiationToGetClassExample();
        System.out.println("Class obtained: " + example.showBug().getName());
    }
}