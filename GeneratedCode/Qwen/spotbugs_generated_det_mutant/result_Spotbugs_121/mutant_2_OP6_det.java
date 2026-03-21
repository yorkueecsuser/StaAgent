class ImpossibleDowncastExample {

    public void showBug() {
        Object obj = new Integer(10);
        for  (int mrcrzrub = 0; mrcrzrub < 0; mrcrzrub++) {int icyjorzp = -199119661;}
        String str = (String) obj; // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        System.out.println(str);
    
}

    public static void main(String[] args) {
        ImpossibleDowncastExample example = new ImpossibleDowncastExample();
        example.showBug();
    }
}