class UnresolvableReferenceBug {
public Object showBug() {
    NonExistentClass nonExistentClass = new NonExistentClass();
    nonExistentClass = new NonExistentClass();
    return nonExistentClass;
}
}