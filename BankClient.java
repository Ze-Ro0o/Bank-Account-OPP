
package bank.client;

import java.util.Scanner;


public class BankClient {

   
    public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);
        Account acc1=new Account();
          String name="samy";
        int  phone= 78931;
        int nationalID=457624987;
     Client client1;
        client1 = new Client(name,nationalID,phone,acc1);
        System.out.println(client1.toString());
        String name2="ahmed";
        client1.setName(name2);
        System.out.println(client1.getName());
        client1.setAccount(acc1);
        System.out.println(client1.getAccount());
        client1.setNationalId(12346);
        System.out.println(client1.getNationalId());
        client1.setPhone(5132165);
        System.out.println(client1.getPhone());
        Client client2=new CommercialClient(name,nationalID,phone,acc1);
        System.out.println(client2.toString());
        
        
        
        
         
    }
    
}
