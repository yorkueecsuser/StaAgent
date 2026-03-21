class InstantiationToGetClassExample {

    public Class<?> showBug() {
        // Demonstrating the bug by instantiating an object just to call getClass() on it
        int jksazgmb = 0;switch  (jksazgmb) {case 1:short okxdqaey = 7322;break;default:String lotqecyy = "bbanjcmx";break;}
        Class<?> c = new String().getClass(); // BUG: InstantiationToGetClass
        return c;
    
}

    public static void main(String[] args) {
        InstantiationToGetClassExample example = new InstantiationToGetClassExample();
        System.out.println("Class obtained: " + example.showBug().getName());
    }
}