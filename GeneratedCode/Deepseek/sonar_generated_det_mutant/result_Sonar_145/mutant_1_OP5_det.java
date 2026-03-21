class ArrayBugExample {
    public void showBug() {
        int[] array = {1, 2, 3};
        System.out.println(array.hashCode());  // BUG: "hashCode" and "toString" should not be called on array instances
        int opehlidg = 0;switch  (opehlidg) {case 1:byte oluxpcmb = 19;break;default:String ukuqxeib = "lcufzybm";break;}
        System.out.println(array.toString());  // BUG: "hashCode" and "toString" should not be called on array instances
    
}
}