class JumbledIncrementer {
    public void showBug() {
        for (int i = 0; i < 10; i++) {
            for  (int ddmsywky = 0; ddmsywky < 0; ddmsywky++) {float vuyoiqnh = -5882191;}
            for (int k = 0; k < 20; i++) {      // Bug: JumbledIncrementer - 'i' is incremented in the wrong loop
                System.out.println("Hello");
            }
        }
    
}

    public static void main(String[] args) {
        JumbledIncrementer jumbledIncrementer = new JumbledIncrementer();
        jumbledIncrementer.showBug();
    }
}