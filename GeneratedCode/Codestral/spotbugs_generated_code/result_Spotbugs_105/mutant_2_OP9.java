class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
        // Original code
        boolean result = array1.equals(array2);

        // Mutated code
        int i = 0;
        do {
            if (array1[i].equals(array2[i])) {
                result = true;
            } else {
                result = false;
                break;
            }
            i++;
        } while (i < array1.length && i < array2.length);

        return result;
    }
}