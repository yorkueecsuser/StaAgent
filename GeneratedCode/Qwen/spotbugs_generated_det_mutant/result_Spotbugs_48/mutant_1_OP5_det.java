class ArrayIndexOutOfBoundsExample {

    public int showBug(int[] array, int index) {
int zxvwjkcs = 0;switch  (zxvwjkcs) {case 1:char qamtttcg = 'k';break;default:short qazaxbho = 2714;break;}

        return array[index]; // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX) 
    
}

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3};
        System.out.println(example.showBug(sampleArray, 3)); // This will cause ArrayIndexOutOfBoundsException
    }
}