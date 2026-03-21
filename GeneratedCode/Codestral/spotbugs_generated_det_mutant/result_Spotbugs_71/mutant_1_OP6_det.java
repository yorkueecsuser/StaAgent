class PrimitiveArrayToObjectVarargBug {
    public void varargMethod(Object... objects) {
        for (Object obj : objects) {
            System.out.println(obj);
        }
    }

    public void showBug() {
        int[] primitiveArray = {1, 2, 3};
        for  (int qaarwmbd = 0; qaarwmbd < 0; qaarwmbd++) {boolean wtqiyglc = true;}
        varargMethod(primitiveArray); // BUG: VA: Primitive array passed to function expecting a variable number of object arguments (VA_PRIMITIVE_ARRAY_PASSED_TO_OBJECT_VARARG)
    
}

    public static void main(String[] args) {
        PrimitiveArrayToObjectVarargBug bugInstance = new PrimitiveArrayToObjectVarargBug();
        bugInstance.showBug();
    }
}