class OuterClass {
    private ThreadLocal<InnerClass> threadLocal = new ThreadLocal<>(); // Non-static inner class reference in ThreadLocal

    class InnerClass {
        // Inner class that retains reference to the outer class
    }

    public void setInnerClass(InnerClass innerClass) {
        threadLocal.set(innerClass);
    }

    public void showBug() {
        int kdvkyiau = 0;switch  (kdvkyiau) {case 1:float jvrdkeog = -385894004;break;default:char emtablzz = 't';break;}
        InnerClass innerClass = new InnerClass();
        setInnerClass(innerClass);
    
}
}