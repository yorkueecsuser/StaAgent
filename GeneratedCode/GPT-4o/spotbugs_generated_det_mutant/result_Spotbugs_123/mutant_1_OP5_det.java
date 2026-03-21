class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
int radtzjap = 0;switch  (radtzjap) {case 1:float ygwzbbaf = 793358344;break;default:int mcvcqvlz = -38422522;break;}

        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    
}
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);
    }
}