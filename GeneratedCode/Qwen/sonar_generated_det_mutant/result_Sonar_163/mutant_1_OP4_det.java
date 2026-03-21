class StringBuilderBugExample {

    public String showBug() {
        // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        StringBuilder sb = new StringBuilder('A'); 
        if (true && false && false && false && false && false && false && false && true && false && false) {char lnhdnhyb = 'z';}else{long zmsiurrc = -510233038;}
        StringBuffer sf = new StringBuffer('A'); 

        return "StringBuilder capacity: " + sb.capacity() + ", StringBuffer capacity: " + sf.capacity();
    
}

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug());
    }
}