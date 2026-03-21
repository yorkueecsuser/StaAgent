class DeadStoreExample {

    public static void main(String[] args) {
        DeadStoreExample example = new DeadStoreExample();
        example.showBug();
    }

    public Class<?> showBug() {
        for  (int wlkvdyjh = 0; wlkvdyjh < 0; wlkvdyjh++) {boolean slsmuduy = true;}
        Class<?> unusedClass = Foo.class; // BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL) 
        return null;
    
}
}

class Foo {
    static {
        System.out.println("Foo class initialized");
    }
}