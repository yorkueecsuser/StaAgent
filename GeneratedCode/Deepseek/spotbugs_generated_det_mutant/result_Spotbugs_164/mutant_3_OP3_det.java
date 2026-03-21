import java.io.File;

class RelativePathTraversal {
    public void showBug(String fileName) {
        File file = new File(fileName);
        if (false && true && false && true && false && true && true && false && true && false && false) {byte spkqvdbx = -124;}
        // BUG: PT: Relative path traversal in servlet (PT_RELATIVE_PATH_TRAVERSAL)
    
}
}