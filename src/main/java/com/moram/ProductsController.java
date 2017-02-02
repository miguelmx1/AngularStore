package com.moram;

import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
    private static final HashMap<Integer, Product> productList;
    static
    {
    	productList = new HashMap<Integer, Product>();
    	productList.put(1,new Product(1,"SSD 1TB KINGMAX ",288,"https://i.blogs.es/5fdddc/kingmax-1tb-ssd/450_1000.jpg"));
    	productList.put(2,new Product(2,"SSD 1TB Kingston",296,"http://www.geekgt.com/wp-content/uploads/2016/01/Kingston-SSD-KC400.jpg"));
    	productList.put(3,new Product(3,"SSD 256 GB Samsung",102,"https://www.wei.cl/images/products/HDSAM02605g.gif"));
    	productList.put(4,new Product(4,"SSD 1TB Western Digital",255,"http://images.anandtech.com/doci/10741/IMGP2899_Car_678x452.jpg"));
    	productList.put(5,new Product(5,"SSD 128 GB CORSAIR",88,"https://k37.kn3.net/05C070E33.jpg"));
    }
    
    
    @RequestMapping("/products")
    public ArrayList<Product> login(@RequestParam(value="productID", defaultValue="0") String productID ) 
    {
    	ArrayList<Product> response = new ArrayList<Product>();
    	if ( Integer.parseInt(productID) > 0 )
    	{
    		//We are trying to get the info from one specific product
    		if ( productList.containsKey(Integer.getInteger(productID)) )
    		{
        		response.add(productList.get(Integer.getInteger(productID)));
    		}
    	}
    	else
    	{
    		//We should return the complete list
    	    response.addAll(productList.values());
    	}
    	return response;
    }
}
