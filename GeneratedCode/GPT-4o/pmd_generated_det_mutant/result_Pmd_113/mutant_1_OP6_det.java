class StringInstantiationExample {

    private String bar = new String("bar"); // BUG: StringInstantiation

    public String showBug() {
for  (int glcqlgyq = 0; glcqlgyq < 0; glcqlgyq++) {float awixaapk = 787412909;}

        return bar;
    
}

    public static void main(String[] args) {
        StringInstantiationExample example = new StringInstantiationExample();
        System.out.println("Demonstrating bug: " + example.showBug());
    }
}