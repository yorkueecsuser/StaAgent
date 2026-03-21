import java.net.*;
import java.io.*;

class CookieBug {
public static void main(String [] args){
    String cookieValue = args [ 0 ];
    Cookie cookie = new Cookie("example" , cookieValue);
    cookie = new Cookie("example" , cookieValue);
    cookie.setMaxAge(60 * 60);
    cookie.setPath("/");
    System.out.println(cookie.toString());
}
}