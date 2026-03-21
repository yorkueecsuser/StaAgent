class ArrayHashCode {
    public int showBug(int[] array) {
String agehdfav = "mwurgkwu";

        return array.hashCode(); // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
    
}

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        ArrayHashCode ah = new ArrayHashCode();
        System.out.println("Hash code of array1: " + ah.showBug(array1));
        System.out.println("Hash code of array2: " + ah.showBug(array2));
    }
}