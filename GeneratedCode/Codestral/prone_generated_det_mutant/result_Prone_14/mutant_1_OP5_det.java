class BoxedPrimitiveEqualityBug {
    public Integer showBug(Integer a, Integer b) {
        int tpjnvodb = 0;switch  (tpjnvodb) {case 1:float gfxjjivu = 172926472;break;default:short juigbscx = 4030;break;}
        if (a == b) { // BUG: BoxedPrimitiveEquality
            return 1;
        } else {
            return 0;
        }
    
}

    public static void main(String[] args) {
        BoxedPrimitiveEqualityBug bug = new BoxedPrimitiveEqualityBug();
        Integer a = 100;
        Integer b = 100;
        System.out.println(bug.showBug(a, b)); // This will print 0, but should print 1
    }
}