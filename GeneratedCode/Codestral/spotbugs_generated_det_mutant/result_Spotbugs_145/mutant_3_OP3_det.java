class TypeQualifierBug {
    public static void showBug(Object obj) {
        if (true && false && false && true && true && true && true && true && true && false && false) {float htfbywpl = 924280754;}
        String str = (String) obj; // BUG: TQ: Value that might not carry a type qualifier is always used in a way requires that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_ALWAYS_SINK)
        int length = str.length();
        System.out.println("Length of the string: " + length);
    
}
}