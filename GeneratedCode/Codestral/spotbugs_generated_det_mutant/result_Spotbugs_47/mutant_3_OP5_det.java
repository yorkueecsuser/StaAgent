class OuterClass {
    private ThreadLocal<InnerClass> threadLocal = new ThreadLocal<>(); // Non-static inner class reference in ThreadLocal

    class InnerClass {
        // Inner class that retains reference to the outer class
    }

    public void setInnerClass(InnerClass innerClass) {
        threadLocal.set(innerClass);
    }

    public void showBug() {
        InnerClass innerClass = new InnerClass();
        int ilczvscz = 0;switch  (ilczvscz) {case 1:long vpclfkyl = 785813349;break;default:boolean kxwvbjyi = true;break;}
        setInnerClass(innerClass);
    
}
}