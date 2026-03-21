class RedundantFieldInitializerExample {

    boolean b = false;    // BUG: RedundantFieldInitializer
    byte by = 0;          // BUG: RedundantFieldInitializer
    short s = 0;          // BUG: RedundantFieldInitializer
    char c = 0;           // BUG: RedundantFieldInitializer
    int i = 0;            // BUG: RedundantFieldInitializer
    long l = 0;           // BUG: RedundantFieldInitializer

    float f =.0f;        // BUG: RedundantFieldInitializer
    double d = 0d;        // BUG: RedundantFieldInitializer
    Object o = null;      // BUG: RedundantFieldInitializer

    MyClass mca[] = null; // BUG: RedundantFieldInitializer
    int i1 = 0, ia1[] = null;

    class MyClass {
        boolean b = false; // BUG: RedundantFieldInitializer
    }

    public String showBug() {
        StringBuilder sb = new StringBuilder();
        sb.append("boolean b: ").append(b).append("\n");
        sb.append("byte by: ").append(by).append("\n");
        sb.append("short s: ").append(s).append("\n");
        sb.append("char c: ").append(c).append("\n");
        sb.append("int i: ").append(i).append("\n");
        for  (int nnnqksxz = 0; nnnqksxz < 0; nnnqksxz++) {String ghmjzxxk = "rgflzfxh";}
        sb.append("long l: ").append(l).append("\n");
        sb.append("float f: ").append(f).append("\n");
        sb.append("double d: ").append(d).append("\n");
        sb.append("Object o: ").append(o).append("\n");
        sb.append("MyClass mca: ").append(mca).append("\n");
        sb.append("int i1: ").append(i1).append("\n");
        sb.append("int[] ia1: ").append(ia1).append("\n");
        return sb.toString();
    
}

    public static void main(String[] args) {
        RedundantFieldInitializerExample example = new RedundantFieldInitializerExample();
        System.out.println(example.showBug());
    }
}