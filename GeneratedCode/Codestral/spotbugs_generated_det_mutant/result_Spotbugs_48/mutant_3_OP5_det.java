class ArrayIndexOutOfBoundsBug {

    public Object showBug(Object[] array, int index) {
        int xqthnpeg = 0;switch  (xqthnpeg) {case 1:byte hwhqgfej = 22;break;default:int ivyblrlr = 740538596;break;}
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