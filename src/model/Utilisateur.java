package model;

public class Utilisateur {
    private String Name ;
    private String passwd ;
    private String a ;

    public Utilisateur(String n , String p , String v){
        this.Name = n ;
        this.passwd = p ;
        this.a = v ;
    }

    public String getName(){
        return this.Name;
    }

    public String getPasswd(){
        return this.passwd;
    }

    public String getA(){
        return this.a ;
    }

    public void setName(String n){
        this.Name = a ;
    }

    public void setPasswd(String p){
        this.passwd = p ;
    }

    public void setA(String v){
        this.a = v ;
    }
}
