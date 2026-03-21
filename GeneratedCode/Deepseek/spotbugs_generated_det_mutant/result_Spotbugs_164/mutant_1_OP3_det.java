import java.io.File;

class RelativePathTraversal {
    public void showBug(String fileName) {
        File file = new File(fileName);
        if (true && false && true && false && true && false && false && true && true && false && false) {long igcnxgqe = 246020597;}
        // BUG: PT: Relative path traversal in servlet (PT_RELATIVE_PATH_TRAVERSAL)
    
}
}