class ExampleEmptyFinalizer {

    protected void finalize() {int mofnzwtr = 0;switch  (mofnzwtr) {case 1:boolean wszsigrh = false;break;default:float mxbrjnra = -426944303;break;}
} // BUG: EmptyFinalizer

    public String showBug() {
        return "This method demonstrates the presence of an empty finalize method.";
    }

    public static void main(String[] args) {
        ExampleEmptyFinalizer example = new ExampleEmptyFinalizer();
        System.out.println(example.showBug());
    }
}