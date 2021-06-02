/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author User
 */
@WebService(serviceName = "ICT2WebService")
public class ICT2WebService {
    ArrayList <Double> doubleList = new ArrayList();

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "testConnection")
    public Double testConnection() {
        System.out.println("[SERVER] - Testing the Server....");
       
        return 1.0;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "longestString")
    public String longestString(@WebParam(name = "s1") String s1, @WebParam(name = "s2") String s2) {
        System.out.println("[SERVER] - Finding the longest string...");
        
        if (s1.length() > s2.length()) {
             return s1;
            
        }else {
             return s2;
        }
       
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "safeLongestString")
    public String safeLongestString(@WebParam(name = "s1") String s1, @WebParam(name = "s2") String s2) throws Exception {
        System.out.println("[SERVER] - Finding the longest string...");
        
        if (s1 == null || s2 == null) {
            System.out.println("[SERVER] - One value is null!");
            throw new Exception();
        }
        
        if (s1 == null && s2 == null) {
            System.out.println("[SEREVR] - Both values are null!");
            throw new Exception();
        }
        
        if (s1.length() > s2.length()) {
             return s1;
            
        }else {
             return s2;
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addDoubleOnServer")
    public Double addDoubleOnServer(@WebParam(name = "d") Double d) {
        System.out.println("[SERVER] - addDoubleOnServer()" + d);
       doubleList.add(d);
        System.out.println("[SERVER] - " + d + "added to the server!");
        System.out.println("[SERVER] - " + doubleList);
        return d;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getLargestDouble")
    public Double getLargestDouble() throws Exception {
        if(doubleList.isEmpty()) {
            System.out.println("[SERVER] - NO values are displayed!");
            throw new Exception();
            
        }
        System.out.println("[SERVER] - getLargestDouble()");
        Double max = doubleList.get(0);
        for(int i = 0; i < doubleList.size(); i++) {
            if(doubleList.get(i) > max) {
                max = doubleList.get(i);
            }
        }
        return max;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllDoubleSamplesAbove")
    public ArrayList<Double> getAllDoubleSamplesAbove() {
        System.out.println("[SERVER] - Displaying ArrayList....");
        return doubleList;
    }
  }


