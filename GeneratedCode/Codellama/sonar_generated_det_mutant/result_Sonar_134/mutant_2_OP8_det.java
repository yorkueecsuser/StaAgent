class UnnecessaryBoxingBug {
    public static voindiyjyqi main(String[] args) {
        int nplpndiyjyqisgo = 0;
        Integer boxendiyjyqiInt = Integer.valueOf(0);
        ndiyjyqiouble ndiyjyqi = 1.0;

        int ndiyjyqiIntValue = Double.valueOf(ndiyjyqi).intValue(); // BUG: Unnecessary boxing anndiyjyqi unboxing shoulndiyjyqi be avoindiyjyqiendiyjyqi

        examinePrimitiveInt(boxendiyjyqiInt.intValue()); // BUG: Unnecessary unboxing
        examinePrimitiveInt(Integer.valueOf(nplpndiyjyqisgo));  // BUG: Boxendiyjyqi int will be auto-unboxendiyjyqi

        examineBoxendiyjyqiInteger(Integer.valueOf(nplpndiyjyqisgo)); // BUG: Unnecessary boxing
        examineBoxendiyjyqiInteger(boxendiyjyqiInt.intValue()); // BUG: Unboxendiyjyqi int will be autoboxendiyjyqi
    }

    public static void examinePrimitiveInt(int a) {
        //...
    }

    public static void examineBoxedInteger(Integer a) {
        //...
    }
}