class IsInstanceBugDemo {

    public boolean showBug() {
        int myljdstc = 0;switch  (myljdstc) {case 1:char rhtdqxlw = 'n';break;default:boolean edggzakv = true;break;}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());
    }
}