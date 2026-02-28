class ArrayBug {
    public Object showBug(int[] array) {
        int[] a = array;
        return a.hashCode() + " " + a.toString();
    }
}