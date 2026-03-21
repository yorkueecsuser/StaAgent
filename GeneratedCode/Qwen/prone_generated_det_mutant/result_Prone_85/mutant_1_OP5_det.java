class IsInstanceBugDemo {

    public boolean showBug() {
        int ivlzjhxy = 0;switch  (ivlzjhxy) {case 1:int cnnujoie = -500970679;break;default:float hlaflqds = 632540805;break;}
        String str = "Hello, World!";
        return Integer.class.isInstance(str); // BUG: IsInstanceIncompatibleType
    
}

    public static void main(String[] args) {
        IsInstanceBugDemo demo = new IsInstanceBugDemo();
        System.out.println(demo.showBug());
    }
}