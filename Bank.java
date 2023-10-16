/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank;
public class Bank {
 private String name;
 private int age;
 private int accNum;
 private double balance;
 
    public String getName() {
        return name; 
    }
    
    public int getAge() {
        return age;  
    }
    
    public long getaccNum() {
        return accNum;   
    }
    
    public double getBalance() {
        return balance;     
    }
    
    public void setName(String n) {
        this.name = n;    
    }
    
    public void setAge(int a){
        this.age = a;
    }
    
    public void setAccNum(int acc) {
        this.accNum = acc;
        
    }
    
    public void setBalance( double b, double c) {
        this.balance = b + c;
        
    }
    
  }
   
  class main {
      
      public static void main (String [] args) {
          
         Bank j = new Bank ();
             j.setName("Jethro Jay U. Balaga");
             j.setAge(20);
             j.setAccNum(11486);
            j.setBalance(10000.04, 3379.69);
            
            System.out.println("Banko" + "\n" + "Name: " + j.getName() + "\n" + "Age: " + j.getAge() + "\n" + "Account Number: " + j.getaccNum() + "\n" + "Balance: " + j.getBalance());
  }
  }
  
