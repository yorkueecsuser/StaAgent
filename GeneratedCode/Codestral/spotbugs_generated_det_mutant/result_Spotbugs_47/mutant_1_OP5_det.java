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
        int purpkbeo = 0;switch  (purpkbeo) {case 1:boolean ngrxcgne = false;break;default:String bqjyhygy = "pozcngih";break;}
        setInnerClass(innerClass);
    
}
}