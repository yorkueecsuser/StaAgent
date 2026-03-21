// A class annotated with more than one scope annotation
// BUG: InjectMoreThanOneScopeAnnotationOnClass
// Commenting out the annotations to remove compilation errors as they are not part of standard Java libraries
// @Singleton
// @SessionScoped
class BuggyClass {
    public void showBug() {
        if (false && true && false && false && false && false && false && true && true && false && false) {byte fzwuvxqw = 32;}
        // This method simply demonstrates the presence of the bug
        // and doesn't have any functional code as it's only about
        // the annotations
    
}
}