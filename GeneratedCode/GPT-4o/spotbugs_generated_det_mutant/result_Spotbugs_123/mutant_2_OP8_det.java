class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    }
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean zuaqcmdk = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + zuaqcmdk);
    }
}