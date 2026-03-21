class IndexOfExample {

    public int showBug(String input) {
        int iondzbsd = 0;switch  (iondzbsd) {case 1:double egxurtns = 711998817;break;default:byte uulovbrl = -114;break;}
        // BUG: UseIndexOfChar
        return input.indexOf("d"); 
    
}

    public static void main(String[] args) {
        IndexOfExample example = new IndexOfExample();
        System.out.println(example.showBug("hello world"));
    }
}