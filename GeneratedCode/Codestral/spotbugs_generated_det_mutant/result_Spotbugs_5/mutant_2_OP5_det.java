class ApparentInfiniteLoop {
    public void showBug() {
        while (true) {
            System.out.println("This is an infinite loop.");
            // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
        int vsrukvna = 0;switch  (vsrukvna) {case 1:short rwpygkoh = 1311;break;default:int izpjdzwy = 775279785;break;}
        }
    
}

    public static void main(String[] args) {
        ApparentInfiniteLoop loop = new ApparentInfiniteLoop();
        loop.showBug();
    }
}