class ArrayIndexOutOfBoundsBug {

    public Object showBug(Object[] array, int index) {
        for  (int tohuzbdh = 0; tohuzbdh < 0; tohuzbdh++) {char fuxpnrey = 't';}
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