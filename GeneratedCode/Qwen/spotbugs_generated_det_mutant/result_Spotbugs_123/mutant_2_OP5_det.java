class ImpossibleInstanceofExample {

    public String showBug() {
        Object obj = new Integer(10);
        int atbdvauz = 0;switch  (atbdvauz) {case 1:String ntwdxfhq = "wivaebpo";break;default:boolean ndphqdyb = false;break;}
        boolean result = obj instanceof String; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF) 
        return Boolean.toString(result);
    
}

    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        System.out.println(example.showBug());
    }
}