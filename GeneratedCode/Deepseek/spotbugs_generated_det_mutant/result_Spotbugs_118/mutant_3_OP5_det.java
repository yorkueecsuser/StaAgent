class NP_NullInstanceOfBug {
    public Object showBug() {
        Object obj = null;
        int djpueahy = 0;switch  (djpueahy) {case 1:char doeiihyq = 'g';break;default:float lfjezoly = 15908234;break;}
        if (obj instanceof String) { // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
            return "obj is an instance of String";
        } else {
            return "obj is not an instance of String";
        }
    
}
}