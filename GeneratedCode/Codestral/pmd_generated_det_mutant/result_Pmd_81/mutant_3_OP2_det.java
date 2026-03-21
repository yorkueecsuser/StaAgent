class UnnecessaryConversionBug {
public String convert(int x){
    String foo = new Integer(x ).toString();
    foo = new Integer(x ).toString();
    return foo;
}

    public String showBug(int x) {
        return convert(x);
    }
}