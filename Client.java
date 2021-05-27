/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.client;

/**
 *
 * @ZeRo
 */
 class Client {
  private int nationalId;
  private String name;
  private Account acc;
  private int phone;
    public Client(){}
   public  Client(String name,int nationalId,int phone,Account acc){
        this.nationalId=nationalId;
        this.phone=phone;
        this.name=name;
        this.acc=acc; 
    }
    public void setName(String name){
        this.name=name;
        
    }
    public String getName(){
        return this.name;
    }
    public void setNationalId(int nationalId){
    this.nationalId=nationalId;
    }
    public int getNationalId(){
        return this.nationalId;
    }
     public void setPhone(int phone){
    this.phone=phone;
     }
      public int getPhone(){
        return this.phone;
    }
      public void setAccount(Account acc){
      this.acc=acc;
      }
      public Account getAccount(){
      return this.acc; 
      }
  @Override
       public  String toString(){
      return "Clinet Name: "+name+"\nNational ID: "+nationalId+"\nPhone: "+phone+"\nAccount: "+acc;
      }
}
