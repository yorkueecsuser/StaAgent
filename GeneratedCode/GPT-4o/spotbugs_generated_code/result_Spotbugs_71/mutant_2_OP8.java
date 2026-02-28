class PrimitiveArrayToVarargsBug {

    public static void main(String[] args) {
        int[] primitiveArray = {1, 2, 3};
        String result = showBug(primitiveArray);
        System.out.println(result);
        
        // Mutant Code
        int[] x = {4, 5, 6};
        String y = showBug(x);
        System.out.println(y);
    }

    public static String showBug(int[] x) {
        return concatenate(x); // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
    }

    public static String concatenate(Object... z) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : z) {
            sb.append(obj.toString()).append(" ");
        }
        return sb.toString().trim();
    }
}