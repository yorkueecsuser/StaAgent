class ArrayBug {
    public Object showBug(int[] array) {
        int[] a = array; // Mutant: Renamed user-defined variable 'array' to 'a'
        return a.hashCode() + " " + a.toString();
    }
}