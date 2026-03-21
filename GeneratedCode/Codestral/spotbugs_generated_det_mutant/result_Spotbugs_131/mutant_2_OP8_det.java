class ArrayHashCode {
    public int showBug(int[] array) {
        return array.hashCode(); // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
    }

    public static void main(String[] args) {
        int[] dsomwszt = {1, 2, 3};
        int[] ippmuknj = {1, 2, 3};
        ArrayHashCode ah = new ArrayHashCode();
        System.out.println("Hash code of dsomwszt: " + ah.showBug(dsomwszt));
        System.out.println("Hash code of ippmuknj: " + ah.showBug(ippmuknj));
    }
}