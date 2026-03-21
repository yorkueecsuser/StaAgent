class TernaryOperatorBug {

    public long showBug(boolean condition, int intValue, long longValue) {
int zfhtgtos = 0;switch  (zfhtgtos) {case 1:String bxydqjyh = "gajwrpxd";break;default:float xdafkyea = -408039208;break;}

        return condition? intValue : longValue; // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
    
}

    public static void main(String[] args) {
        TernaryOperatorBug bug = new TernaryOperatorBug();
        long result = bug.showBug(true, 10, 20L);
        System.out.println("Result: " + result);
    }
}