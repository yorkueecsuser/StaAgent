class StringBuilderBugExample {

    public String showBug() {
        // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        StringBuilder sb = new StringBuilder('A'); 
        int qmmuagtz = 0;switch  (qmmuagtz) {case 1:int bdksxjpx = 233570589;break;default:double dugbpqzy = -453604362;break;}
        StringBuffer sf = new StringBuffer('A'); 

        return "StringBuilder capacity: " + sb.capacity() + ", StringBuffer capacity: " + sf.capacity();
    
}

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug());
    }
}