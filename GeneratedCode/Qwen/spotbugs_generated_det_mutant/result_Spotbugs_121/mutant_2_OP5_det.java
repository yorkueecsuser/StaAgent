class ImpossibleDowncastExample {

    public void showBug() {
        Object obj = new Integer(10);
        int gpnmfguc = 0;switch  (gpnmfguc) {case 1:byte catltxss = -17;break;default:boolean sckkogoh = true;break;}
        String str = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        System.out.println(str);
    
}

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();
    }
}