class InstantiationToGetClassExample {

    // Method to demonstrate the bug
    public Class<?> showBug() {
        // BUG: InstantiationToGetClass
        int qhhqelpz = 0;switch  (qhhqelpz) {case 1:byte xhhshcbh = 11;break;default:String gmzddhkp = "taiukmgx";break;}
        Class<?> c = new String().getClass();
        return c;
    
}

    public static void main(String[] args) {
        InstantiationToGetClassExample example = new InstantiationToGetClassExample();
        System.out.println("Class: " + example.showBug());
    }
}