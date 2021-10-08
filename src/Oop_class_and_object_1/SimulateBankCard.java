package Oop_class_and_object_1;
import java.lang.Math;
public class SimulateBankCard {

    private int accountNumber = (int) Math.random();
    private int cardNumber = (int) Math.random();
    private int holderNumber = (int) Math.random();
    private int validThroug = (int) Math.random();
    private int PIN = (int) Math.random();
    private int securityCode = (int) Math.random();
    private String cardType;
    private String bankName;

    public SimulateBankCard(){}

    public SimulateBankCard(int accountNumber, int cardNumber, int holderNumber, int validThroug, int PIN,
                            int securityCode, String cardType,String bankName){

        this.accountNumber = accountNumber;
        this.cardNumber = cardNumber;
        this.holderNumber = holderNumber;
       this.validThroug = validThroug;
       this.securityCode = securityCode;
        this.PIN = PIN;
        this.bankName = bankName;
        this.cardType = cardType;

    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getCardNumber(){
        return cardNumber;
    }
    public void setCardNumber(int cardNumber){
        this.cardNumber = cardNumber;
    }
    public int getHolderNumber(){
        return holderNumber;
    }
    public void setHolderNumber(int holderNumber){
        this.holderNumber = holderNumber;
    }
    public int getValidThroug(){
        return validThroug;
    }
    public void setValidThroug(int validThroug){
        this.validThroug = validThroug;
    }
    public int getSecurityCode(){
        return  securityCode;
    }
    public void setSecurityCode(int securityCode){
        this.securityCode = securityCode;
    }
    public int getPIN(){
        return PIN;
    }
    public void setPIN(int PIN){
        this.PIN = PIN;
    }
    public String getCardType(){
        return cardType;
    }
    public void setCardType(String cardType){
        this.cardType = cardType;
    }
    public String getBankName(){
        return bankName;
    }
    public void setBankName(String bankName){
        this.bankName = bankName;
    }

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Vlerat qe mund te depozitohen jane vetem vlerat pozitive");
            return;
        }
        else if(amount>10000){
            System.out.println("Ne llogari nuk mund te depozitohen me shume se 10000 euro");
            return;
        }
        else{
            System.out.println("Llogaria nuk eshte aktive");
        }
    }

    public void withdraw(double amount){
        if(amount>5000){
            System.out.println("Ju nuk mund te terhiqni me shume se 5000 euro brenda 24 oreve nga llogaria juaj");
            return;
        }
        else if(amount<=5000) {
            System.out.println("Terhiqni parat");
            return;
        }
        else{
            System.out.println("Ju nuk keni fonde te mjaftueshme, shtypni nje vlere me te vogel");
        }
    }
    public void checkBalance(boolean Password, double Balance){
        if(Password==true){
           System.out.println("Shuma e balancin ne llogarine tuaj eshte " + Balance);
           return;
        }
        else{
            System.out.println("Passwordi eshte shtypur gabim, provoni perseri qe te perdoni sherbimet tona");
        }
    }
    public void print(double amount){
        if(amount >= 0){
            System.out.println("Shtypni butonin print per te printuar faturen");

        }
    }








}
