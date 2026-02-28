class PrimitiveArrayToVarargsBug {

    public static void main(String[] args) {
        int[] x = {1, 2, 3}; // Renamed primitiveArray to x
        String y = showBug(x); // Renamed result to y
        System.out.println(y);
    }

    public static String showBug(int[] numbers) {
        return concatenate(numbers); // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
    }

    public static String concatenate(Object... z) { // Renamed objects to z
        StringBuilder sb = new StringBuilder();
        for (Object obj : z) {
            sb.append(obj.toString()).append(" ");
        }
        return sb.toString().trim();
    }
}