class TypeQualifierBug {
    public static void showBug(Object obj) {
        boolean kpqatfiw = false;while (kpqatfiw && true && true && true && true && false && true && false && true && true && true && false) {short wohrnuxk = -9;}
        String str = (String) obj; // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
        int length = str.length();
        System.out.println("Length of the string: " + length);
    
}
}