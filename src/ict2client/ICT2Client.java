/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ict2client;


import server.Exception_Exception;

/**
 *
 * @author User
 */
public class ICT2Client {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ICT2Client client = new ICT2Client();
        client.execute();
    }

    private void execute() {
        System.out.println("[CLIENT] - Testing the connection...");
        
        if(testConnection() == 1.0) {
            System.out.println("[CLIENT] - Server is connected, test can continue...");
            
        // Testing longestString method
        String s1 = "Banana";
        String s2 = "Pineapple";
        String s = longestString(s1, s2);
        System.out.println("[CLEINT] - Server has returned the longest string: " + s);
        
        // Testing safeLongestString method
        
        s1 = "Banana";
        s2 = null;
        
        try {
            s = safeLongestString(s1, s2);
            System.out.println("[CLEINT] - Server has returned the longest string: " + s);
        } catch (Exception ex){
            System.out.println("[CLIENT] - One value is null! " + ex);
        }
        
        s1 = null;
        s2 = "Pineapple";
        
        try {
            s = safeLongestString(s1, s2);
            System.out.println("[CLEINT] - Server has returned the longest string: " + s);
        } catch (Exception ex){
            System.out.println("[CLIENT] - One value is null! " + ex);
        }
        
        s1 = null;
        s2 = null;
        
        try {
            s = safeLongestString(s1, s2);
            System.out.println("[CLEINT] - Server has returned the longest string: " + s);
        } catch (Exception ex){
            System.out.println("[CLIENT] - Both values are null! " + ex);
        }
        
        //Testing addDoubleOnServer
        try {
            Double v = 2.0;
            addDoubleOnServer(v);
            System.out.println("[CLIENT] - Value has added: " + v);
            System.out.println("[CLIENT] - Largest value is " + getLargestDouble());
            
        }catch(Exception_Exception ex) {
            System.out.println("[CLIENT] - Error will be displayed! " + ex);
            
        }
        
        try {
            Double v = 4.0;
            addDoubleOnServer(v);
            System.out.println("[CLIENT] - Value has added: " + v);
            System.out.println("[CLIENT] - Largest value is " + getLargestDouble());
            
        }catch(Exception_Exception ex) {
            System.out.println("[CLIENT] - Error will be displayed! " + ex);
            
        }
        
        try {
            Double v = 6.0;
            addDoubleOnServer(v);
            System.out.println("[CLIENT] - Value has added: " + v);
            System.out.println("[CLIENT] - Largest value is " + getLargestDouble());
            
        }catch(Exception_Exception ex) {
            System.out.println("[CLIENT] - Error will be displayed! " + ex);
            
        }
        
        //Testing getAllDoubleSamplesAbove
        
            System.out.println("[CLIENT] - The double samples are: " + getAllDoubleSamplesAbove());
            
        }else {
            System.out.println("[CLIENT] - Server is not connected, test has failed!");
        }
        
        System.out.println("[CLIENT] - Test completed!");
    }

    private static Double testConnection() {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.testConnection();
    }

    private static String longestString(java.lang.String s1, java.lang.String s2) {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.longestString(s1, s2);
    }

    private static String safeLongestString(java.lang.String s1, java.lang.String s2) throws Exception_Exception {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.safeLongestString(s1, s2);
    }

    private static Double addDoubleOnServer(java.lang.Double d) {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.addDoubleOnServer(d);
    }

    private static Double getLargestDouble() throws Exception_Exception {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.getLargestDouble();
    }

    private static java.util.List<java.lang.Double> getAllDoubleSamplesAbove() {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.getAllDoubleSamplesAbove();
    }
    
}
