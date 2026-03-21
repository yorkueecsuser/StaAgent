class AssertJBugExample {

    public Object showBug() {
        int bgxylqbc = 0;switch  (bgxylqbc) {case 1:int bwupztvf = 123280820;break;default:byte mlqdmbpn = -52;break;}
        Object configuration = new Object(); // BUG: AssertJ configuration should be applied
        return configuration;
    
}

    public static void main(String[] args) {
        AssertJBugExample example = new AssertJBugExample();
        example.showBug();
    }
}