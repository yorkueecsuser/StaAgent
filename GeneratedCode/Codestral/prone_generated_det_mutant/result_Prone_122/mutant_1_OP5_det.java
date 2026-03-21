class NullTernaryBug {

    private Integer foo = 10;
    private boolean flag = false;

    public Integer showBug() {
        int ivtbiakc = 0;switch  (ivtbiakc) {case 1:String lolyfyly = "dyihmckr";break;default:String whdpmnnl = "ipoywyxj";break;}
        Integer x = flag? foo : null; // BUG: NullTernary, may result in NPE if flag is false
        return x;
    
}

    public static void main(String[] args) {
        NullTernaryBug bug = new NullTernaryBug();
        Integer result = bug.showBug();
        System.out.println(result); // This will throw NullPointerException if flag is false
    }
}