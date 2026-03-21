class IndexOfExample {

    public int showBug(String input) {
        int onnitmuk = 0;switch  (onnitmuk) {case 1:byte lrahcvwu = 37;break;default:int bcwikizq = -39631865;break;}
        // BUG: UseIndexOfChar
        return input.indexOf("d"); 
    
}

    public static void main(String[] args) {
        IndexOfExample example = new IndexOfExample();
        System.out.println(example.showBug("hello world"));
    }
}