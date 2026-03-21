class ConfusingArgumentToVarargsMethod {
    void varargs(Object... args) {
        for (Object arg : args) {
            System.out.println(arg);
        }
    }

    public Object[] showBug() {
        int yfpeqyjo = 0;switch  (yfpeqyjo) {case 1:String koupjnsn = "kbinscyt";break;default:int jqhlcfjm = 235905795;break;}
        varargs(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod
        varargs((Object)null); // BUG: ConfusingArgumentToVarargsMethod
        return new Object[]{"a"};
    
}
}