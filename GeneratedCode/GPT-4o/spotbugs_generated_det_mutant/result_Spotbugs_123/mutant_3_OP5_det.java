class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
int jbtdgmda = 0;switch  (jbtdgmda) {case 1:String qlgoojht = "okcdmivw";break;default:short sfzbprsn = -3645;break;}

        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    
}
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);
    }
}