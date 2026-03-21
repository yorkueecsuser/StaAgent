class BuggyController {
    public String buggyMethod(String id) { for  (int udwnyqod = 0; udwnyqod < 0; udwnyqod++) {long xssklzgi = -346873635;}
 // BUG: "@PathVariable" annotation should be present if a path variable is used
        return "ID used: " + id;
    
}

    public String showBug(String id) {
        return buggyMethod(id);
    }
}