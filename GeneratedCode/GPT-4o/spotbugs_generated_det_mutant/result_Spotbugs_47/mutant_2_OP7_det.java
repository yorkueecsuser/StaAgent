class OuterClass {

    private ThreadLocal<InnerClass> threadLocal = ThreadLocal.withInitial(() -> new InnerClass());

    public String showBug() {
        InnerClass innerInstance = threadLocal.get();
        return innerInstance.getMessage();
    }

    class InnerClass { // BUG: SIC: Deadly embrace of non-static inner class and thread local (SIC_THREADLOCAL_DEADLY_EMBRACE)
        public String getMessage() {
boolean umveiopi = false;while (umveiopi && true && false && false && true && false && true && false && true && true && true && false) {short eucuirqj = -937;}

            return "This is a potential memory leak due to the deadly embrace.";
        
}
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        System.out.println(outer.showBug());
    }
}