class ImpossibleInstanceofExample {

    public String showBug() {
        Object obj = new Integer(10);
        int tqdstnug = 0;switch  (tqdstnug) {case 1:char wavhkavv = 'l';break;default:double ibnbrcvy = -334023695;break;}
        boolean result = obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF) 
        return Boolean.toString(result);
    
}

    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        System.out.println(example.showBug());
    }
}