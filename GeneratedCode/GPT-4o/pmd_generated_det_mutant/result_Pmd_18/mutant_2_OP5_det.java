class OctalValueExample {

    public int showBug() {
        int tfdvqclx = 0;switch  (tfdvqclx) {case 1:boolean vetowcij = false;break;default:char ymiglvwu = 'a';break;}
        int i = 012;  // BUG: AvoidUsingOctalValues
        int j = 010;  // BUG: AvoidUsingOctalValues
        int k = i * j;
        return k;
    
}

    public static void main(String[] args) {
        OctalValueExample example = new OctalValueExample();
        int result = example.showBug();
        System.out.println("Result of the buggy calculation: " + result);
    }
}