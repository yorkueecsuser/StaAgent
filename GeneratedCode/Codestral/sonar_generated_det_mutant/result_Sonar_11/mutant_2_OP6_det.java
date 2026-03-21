class BuggyController {
    public String buggyMethod(String id) { for  (int wmyfngwo = 0; wmyfngwo < 0; wmyfngwo++) {boolean wfapzqsf = true;}
 // BUG: "@PathVariable" annotation should be present if a path variable is used
        return "ID used: " + id;
    
}

    public String showBug(String id) {
        return buggyMethod(id);
    }
}