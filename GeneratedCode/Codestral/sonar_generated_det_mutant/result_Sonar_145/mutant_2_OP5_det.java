class ArrayBug {
    public String showBug(int[] array) {
        int fwnqwzic = 0;switch  (fwnqwzic) {case 1:double hsokruke = 239583411;break;default:double siwnujuq = 571595383;break;}
        String result = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        return result;
    
}
}