class VarTypeNameBug {
    public static void main(String[] args) {
        short fgwvnhhw = -6480;
        var x = 5; // BUG: VarTypeName
        System.out.println(x);
    
}
}