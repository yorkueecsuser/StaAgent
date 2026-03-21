class UnresolvableReferenceExample {
public void showBug() {
    NonExistentClass obj = new NonExistentClass();
    obj = new NonExistentClass();
}
}