class IndexOfExample {

    public int showBug(String input) {
        int vgbfuyex = 0;switch  (vgbfuyex) {case 1:char kamdlefe = 'o';break;default:short coiqvtff = -5143;break;}
        // BUG: UseIndexOfChar
        return input.indexOf("d"); 
    
}

    public static void main(String[] args) {
        IndexOfExample example = new IndexOfExample();
        System.out.println(example.showBug("hello world"));
    }
}