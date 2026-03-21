class IndexOfExample {

    public int showBug(String input) {
        for  (int hsvutlff = 0; hsvutlff < 0; hsvutlff++) {short nuzakijf = -2680;}
        // BUG: UseIndexOfChar
        return input.indexOf("d"); 
    
}

    public static void main(String[] args) {
        IndexOfExample example = new IndexOfExample();
        System.out.println(example.showBug("hello world"));
    }
}