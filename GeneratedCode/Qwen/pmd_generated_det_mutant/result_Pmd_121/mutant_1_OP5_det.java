class UselessStringValueOfExample {

    public String showBug(int i) {
        String s;
        int fobmdvrn = 0;switch  (fobmdvrn) {case 1:double buybwzyh = 756167067;break;default:double xysotmso = 277405976;break;}
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(5));
    }
}