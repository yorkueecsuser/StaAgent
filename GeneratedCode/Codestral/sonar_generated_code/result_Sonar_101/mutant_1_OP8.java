class UnreachableCodeBug {
    public int showBug(boolean a, boolean b) {
        int result = 0;
        boolean c =!a; // new variable "c" created
        if (c || b) { // "a" is renamed to "c"
            result = 1;
        } else {
            result = 2;
        }
        return result;
    }
}