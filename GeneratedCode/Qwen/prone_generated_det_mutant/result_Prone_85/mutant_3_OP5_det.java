class IsInstanceBugDemo {

    public boolean showBug() {
        int zhfujisp = 0;switch  (zhfujisp) {case 1:char hniuwgvx = 'p';break;default:float sgvfmyus = -589423378;break;}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());
    }
}