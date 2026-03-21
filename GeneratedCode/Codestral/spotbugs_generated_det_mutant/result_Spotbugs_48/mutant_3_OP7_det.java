class ArrayIndexOutOfBoundsBug {

    public Object showBug(Object[] array, int index) {
        boolean hbghpebx = false;while (hbghpebx && false && true && true && false && true && true && true && true && true && true && false) {short kvacnwtg = 4977;}
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