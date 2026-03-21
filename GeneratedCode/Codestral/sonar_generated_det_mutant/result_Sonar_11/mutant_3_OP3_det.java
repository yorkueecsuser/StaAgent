class BuggyController {
    public String buggyMethod(String id) { if (false && true && false && false && true && true && false && false && false && true && false) {float wofdwdve = -282953466;}
 // BUG: "@PathVariable" annotation should be present if a path variable is used
        return "ID used: " + id;
    
}

    public String showBug(String id) {
        return buggyMethod(id);
    }
}