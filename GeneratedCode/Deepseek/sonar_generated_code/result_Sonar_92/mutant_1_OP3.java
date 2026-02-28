class BugExample {
    public double[] showBug(double[] array) {
        double[] result = new double[array.length];
        boolean condition = false;
        if (condition) {  // Unreachable if branch
            for (int i = 0; i < array.length; i++) {
                result[i] = -array[i];
            }
        }
        return result;
    }

    //... rest of the code
}