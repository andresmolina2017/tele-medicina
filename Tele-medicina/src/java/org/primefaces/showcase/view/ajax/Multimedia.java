package org.primefaces.showcase.view.ajax;


import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class Multimedia {
     
    private List<String> images;
     
    @PostConstruct
    public void init() {
        images = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            images.add("hospital" + i + ".jpg");
        }
    }
 
    public List<String> getImages() {
        return images;
    }
}


/**
 *
 * @author carlos andres
 */


    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

