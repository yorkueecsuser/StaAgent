class BuggyController {
    public String buggyMethod(String id) { if (false && true && true && false && false && true && true && true && true && false && false) {boolean bxteprsj = false;}else{char vyypbtgq = 'u';}
 // BUG: "@PathVariable" annotation should be present if a path variable is used
        return "ID used: " + id;
    
}

    public String showBug(String id) {
        return buggyMethod(id);
    }
}