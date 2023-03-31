/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoenumeration;

//import java.util.Dictionary;
import java.util.Enumeration;
//import java.util.Hashtable;
import org.apache.logging.log4j.*;

/**
 *
 * @author Admin
 */
public class DemoEnumeration {
    
    public static Logger log = LogManager.getLogger(DemoEnumeration.class.getName());
    /**
     * @param args command line arguments
     */
    public static void main(String[] args) {
        log.debug("Hello, logger");
        log.info("Hello, logger, info");
        log.error("Hello logger, error");
        
        MyArray arr = new MyArray(100);
        arr.add(10);
        arr.add(5);
        arr.add(8);
        arr.add(15);
        Enumeration<Integer> enumeration = arr.getEnumeration();
        while (enumeration.hasMoreElements()) {
            int item = enumeration.nextElement();
            System.out.println("item = " + item);
        }
        
//        Dictionary dict = new Hashtable();
//        dict.put("Quang","quang@gmail.com");
//        dict.put("Sinh","quang@gmail.com");
//        String email = (String)dict.get("Quang");
    }
}
