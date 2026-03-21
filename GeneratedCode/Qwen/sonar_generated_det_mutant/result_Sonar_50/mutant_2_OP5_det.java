class AssertJBugExample {

    public Object showBug() {
        int vjarjjjz = 0;switch  (vjarjjjz) {case 1:double xeufsxye = 647559709;break;default:long tdsibtzm = 937651876;break;}
        Object configuration = new Object(); // BUG: AssertJ configuration should be applied
        return configuration;
    
}

    public static void main(String[] args) {
        AssertJBugExample example = new AssertJBugExample();
        example.showBug();
    }
}