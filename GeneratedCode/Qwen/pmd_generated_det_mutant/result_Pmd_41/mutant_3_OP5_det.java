class ExampleEmptyFinalizer {

    protected void finalize() {int iwxtqdyy = 0;switch  (iwxtqdyy) {case 1:long bgnoeoqm = -92245815;break;default:long chmvlyrg = -345403365;break;}
} // BUG: EmptyFinalizer

    public String showBug() {
        return "This method demonstrates the presence of an empty finalize method.";
    }

    public static void main(String[] args) {
        ExampleEmptyFinalizer example = new ExampleEmptyFinalizer();
        System.out.println(example.showBug());
    }
}