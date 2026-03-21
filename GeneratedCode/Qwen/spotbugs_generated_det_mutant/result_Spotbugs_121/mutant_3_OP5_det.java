class ImpossibleDowncastExample {

    public void showBug() {
        Object obj = new Integer(10);
        int kcyfafva = 0;switch  (kcyfafva) {case 1:int udnqeods = 106452961;break;default:boolean qdzhfaku = false;break;}
        String str = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        System.out.println(str);
    
}

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();
    }
}