class PrimitiveArrayToVarargsBug {

    public static void main(String[] args) {
        int[] a = {1, 2, 3}; // Renamed variable 'primitiveArray' to 'a'
        String result = showBug(a);
        System.out.println(result);
    }

    public static String showBug(int[] numbers) {
        return concatenate(numbers); // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
    }

    public static String concatenate(Object... objects) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : objects) {
            sb.append(obj.toString()).append(" ");
        }
        return sb.toString().trim();
    }
}