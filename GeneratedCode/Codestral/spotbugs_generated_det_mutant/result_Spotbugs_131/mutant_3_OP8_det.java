class ArrayHashCode {
    public int showBug(int[] array) {
        return array.hashCode(); // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
    }

    public static void main(String[] args) {
        int[] lpyehyvd = {1, 2, 3};
        int[] zbkmojhk = {1, 2, 3};
        ArrayHashCode ah = new ArrayHashCode();
        System.out.println("Hash code of lpyehyvd: " + ah.showBug(lpyehyvd));
        System.out.println("Hash code of zbkmojhk: " + ah.showBug(zbkmojhk));
    }
}