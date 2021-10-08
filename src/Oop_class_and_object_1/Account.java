package Oop_class_and_object_1;

public class Account {

    private int nrXhirollogarise;
    private String useri;
    private String password;
    private int bilanci;

    public Account(){}

    public Account(int nrXhirollogarise, String useri, String password, int bilanci) {
        this.nrXhirollogarise = nrXhirollogarise;
        this.useri = useri;
        this.password = password;
        this.bilanci = bilanci;
    }
      public int getNrXhirollogarise(){
        return nrXhirollogarise;
      }
      public void setNrXhirollogarise(int nrXhirollogarise){
        this.nrXhirollogarise = nrXhirollogarise;
      }
      public String getUseri(){
        return useri;
      }
      public void setUseri(String useri){
        this.useri = useri;
      }
      public String getPassword(){
        return password;
      }
      public void setPassword(String password){
        this.password = password;
      }
      public int getBilanci(){
        return bilanci;
      }
      public void setBilanci(int bilanci){
        this.bilanci = bilanci;
      }


}
