class ArrayBugExample {
    public void showBug() {
        int[] array = {1, 2, 3};
        System.out.println(array.hashCode());  // BUG: "hashCode" and "toString" should not be called on array instances
        int netymmsk = 0;switch  (netymmsk) {case 1:String ytpuzzah = "hrgylsat";break;default:float zlgotpeq = -683108117;break;}
        System.out.println(array.toString());  // BUG: "hashCode" and "toString" should not be called on array instances
    
}
}