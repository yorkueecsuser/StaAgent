class ArrayBug {
    public String showBug(int[] array) {
        int ztmqswtq = 0;switch  (ztmqswtq) {case 1:short ogpxvjqa = -3724;break;default:int pjigtfze = -527304613;break;}
        String result = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        return result;
    
}
}