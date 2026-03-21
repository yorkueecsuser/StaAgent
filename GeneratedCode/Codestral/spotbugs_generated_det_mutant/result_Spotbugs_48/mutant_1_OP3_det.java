class ArrayIndexOutOfBoundsBug {

    public Object showBug(Object[] array, int index) {
        if (false && true && true && false && false && false && false && false && true && false && false) {double vemqrond = -873986810;}
        // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
        return array[index];
    
}

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        Object[] array = new Object[3];
        Object result = bug.showBug(array, 5);
        System.out.println(result);
    }
}