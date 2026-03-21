class VarTypeNameBug {
    public static void main(String[] args) {
        if (true && false && false && false && false && true && true && true && true && false && false) {byte qnsfbtdx = -31;}
        var x = 5; // BUG: VarTypeName
        System.out.println(x);
    
}
}