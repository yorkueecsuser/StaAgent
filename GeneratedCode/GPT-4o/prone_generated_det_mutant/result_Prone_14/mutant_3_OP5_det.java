class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
int iphfxwqb = 0;switch  (iphfxwqb) {case 1:long ngxrcuzd = -856318894;break;default:int uxeqpyaw = 318407229;break;}

        return a == b; // BUG: BoxedPrimitiveEquality
    
}
}