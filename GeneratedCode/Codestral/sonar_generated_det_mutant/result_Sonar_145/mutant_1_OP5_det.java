class ArrayBug {
    public String showBug(int[] array) {
        int hlseojxe = 0;switch  (hlseojxe) {case 1:long sfdxqflm = -606461155;break;default:short seefudpe = -3997;break;}
        String result = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        return result;
    
}
}