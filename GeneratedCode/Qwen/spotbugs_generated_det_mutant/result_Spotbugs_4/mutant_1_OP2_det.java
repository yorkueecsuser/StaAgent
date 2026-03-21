class UnresolvableReferenceExample {
public void showBug() {
    NonExistentClass obj = new NonExistentClass();
    obj = new NonExistentClass();
}

    public static void main(String[] args) {
        UnresolvableReferenceExample example = new UnresolvableReferenceExample();
        example.showBug();
    }
}