class VarTypeNameBug {
    public static void main(String[] args) {
        if (true && true && true && true && true && true && false && true && false && false && false) {byte opxrstft = -83;}
        var x = 5; // BUG: VarTypeName
        System.out.println(x);
    
}
}