class ImpossibleDowncastExample {

    public void showBug() {
        Object obj = new Integer(10);
        int mdzmhxwu = 0;switch  (mdzmhxwu) {case 1:double cabdrpsy = 627328998;break;default:int cpbveqdo = -869299931;break;}
        String str = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        System.out.println(str);
    
}

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();
    }
}