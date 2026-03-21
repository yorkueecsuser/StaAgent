class ArrayHashCode {
    public int showBug(int[] array) {
        return array.hashCode(); // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
    }

    public static void main(String[] args) {
        int[] gcuxqqja = {1, 2, 3};
        int[] fngjlvva = {1, 2, 3};
        ArrayHashCode ah = new ArrayHashCode();
        System.out.println("Hash code of gcuxqqja: " + ah.showBug(gcuxqqja));
        System.out.println("Hash code of fngjlvva: " + ah.showBug(fngjlvva));
    }
}