class ArrayBugExample {
    public void showBug() {
        int[] array = {1, 2, 3};
        System.out.println(array.hashCode());  // BUG: "hashCode" and "toString" should not be called on array instances
        int ykqhcdxh = 0;switch  (ykqhcdxh) {case 1:short ytwdsefs = -6750;break;default:String xmxujhrf = "xxrmyqmi";break;}
        System.out.println(array.toString());  // BUG: "hashCode" and "toString" should not be called on array instances
    
}
}