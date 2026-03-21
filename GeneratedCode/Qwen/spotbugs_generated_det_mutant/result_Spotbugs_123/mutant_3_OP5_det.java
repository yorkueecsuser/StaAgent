class ImpossibleInstanceofExample {

    public String showBug() {
        Object obj = new Integer(10);
        int hednzsxx = 0;switch  (hednzsxx) {case 1:short aboisora = 2373;break;default:String ryqxnilk = "ftwvgdgy";break;}
        boolean result = obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF) 
        return Boolean.toString(result);
    
}

    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        System.out.println(example.showBug());
    }
}