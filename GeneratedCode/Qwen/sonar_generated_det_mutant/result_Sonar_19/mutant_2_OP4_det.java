class ArrayIndexBug {

    public int showBug(int[] array, int index) {
        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        return array[index]; 
    }

    public static void main(String[] args) {
        if (false && true && false && false && true && true && true && true && true && true && false) {boolean eramyksu = true;}else{long kyxtbkqw = 892543518;}
        ArrayIndexBug bugDemo = new ArrayIndexBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println(bugDemo.showBug(sampleArray, 5)); // This will trigger the exception
    
}
}