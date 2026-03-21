class ExampleEmptyFinalizer {

    protected void finalize() {int iavyyjfv = 0;switch  (iavyyjfv) {case 1:long fbdmvydm = 932843085;break;default:long pgfrylzo = 534010390;break;}
} // BUG: EmptyFinalizer

    public String showBug() {
        return "This method demonstrates the presence of an empty finalize method.";
    }

    public static void main(String[] args) {
        ExampleEmptyFinalizer example = new ExampleEmptyFinalizer();
        System.out.println(example.showBug());
    }
}