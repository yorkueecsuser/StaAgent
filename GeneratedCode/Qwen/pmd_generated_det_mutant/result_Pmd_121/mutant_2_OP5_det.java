class UselessStringValueOfExample {

    public String showBug(int i) {
        String s;
        int jtmmaxqs = 0;switch  (jtmmaxqs) {case 1:long frachqsi = 984106833;break;default:double ivfhkrot = 514507716;break;}
        s = "a" + String.valueOf(i);    // BUG: UselessStringValueOf
        return s;
    
}

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(5));
    }
}