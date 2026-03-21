class InstantiationToGetClassExample {

    // Method to demonstrate the bug
    public Class<?> showBug() {
        // BUG: InstantiationToGetClass
        int ayyozeyo = 0;switch  (ayyozeyo) {case 1:double rchnbmkb = 217224722;break;default:boolean qvrgycug = false;break;}
        Class<?> c = new String().getClass();
        return c;
    
}

    public static void main(String[] args) {
        InstantiationToGetClassExample example = new InstantiationToGetClassExample();
        System.out.println("Class: " + example.showBug());
    }
}