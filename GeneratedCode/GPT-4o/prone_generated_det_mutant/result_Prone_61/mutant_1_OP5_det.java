class GetClassOnClassExample {

    public String showBug() {
        Class<?> clazz = String.class;
        // BUG: GetClassOnClass
        int mfivvvfw = 0;switch  (mfivvvfw) {case 1:long vsgzhwsy = -182530422;break;default:char rhbigmil = 't';break;}
        String className = clazz.getClass().getName(); // This mistakenly gets the name for java.lang.Class
        return className;
    
}

    public static void main(String[] args) {
        GetClassOnClassExample example = new GetClassOnClassExample();
        System.out.println("Class name obtained: " + example.showBug());
    }
}