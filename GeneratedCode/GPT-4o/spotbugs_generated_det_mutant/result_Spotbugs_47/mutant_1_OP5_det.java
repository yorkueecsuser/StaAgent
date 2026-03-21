class OuterClass {

    private ThreadLocal<InnerClass> threadLocal = ThreadLocal.withInitial(() -> new InnerClass());

    public String showBug() {
        InnerClass innerInstance = threadLocal.get();
        return innerInstance.getMessage();
    }

    class InnerClass { // BUG: SIC: Deadly embrace of non-static inner class and thread local (SIC_THREADLOCAL_DEADLY_EMBRACE)
        public String getMessage() {
int pjxyaems = 0;switch  (pjxyaems) {case 1:long lznxyvyw = -524330168;break;default:String juktqmix = "kyatgmte";break;}

            return "This is a potential memory leak due to the deadly embrace.";
        
}
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        System.out.println(outer.showBug());
    }
}