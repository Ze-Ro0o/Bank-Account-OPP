/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.client;

/**
 *
 * @author ZeRo
 */
 class CommercialClient extends Client {
    
private int commercialId;

    public CommercialClient(String name,int commercialId, int phone, Account acc) {
        this.commercialId=commercialId;
        super.setNationalId(0);
       super.setPhone(phone);
      super.setAccount(acc); 
       super.setName(name);
    }
public void setCommercialId(int commercialId){
this.commercialId=commercialId;
}
public int getCommercialId(){
return this.commercialId;}
@Override
 public String toString(){
  return "Clinet Name: "+super.getName()+"\nCommercial ID: "+ commercialId+"\nPhone: "+super.getPhone()+"\nAccount: "+super.getAccount();
 }     
        
    }
      
   
    
    
