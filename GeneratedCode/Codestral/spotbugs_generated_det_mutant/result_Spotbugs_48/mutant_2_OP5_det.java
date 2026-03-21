class ArrayIndexOutOfBoundsBug {

    public Object showBug(Object[] array, int index) {
        int embcamye = 0;switch  (embcamye) {case 1:long qysxxffs = 761285449;break;default:double npqctoas = -966627982;break;}
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