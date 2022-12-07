import java.lang.Math;

abstract class AccountHolder{
    protected int ID;
    protected String address;

    public AccountHolder(int ID, String address){
        this.ID = ID;
        this.address = address;
    }


    public static int getNextID(){
        return (int)(Math.random() * 1000000) + 1;
    }
}

interface Util{
    public String convertNameUpperCase(String name);
}

class IndividualHolder extends AccountHolder implements Util{
    private String name;
    private String SSN;

    public IndividualHolder(int ID, String address, String name, String SSN) {
        super(ID, address);
        this.name = name;
        this.SSN = SSN;
    }


    public String getName(){
        return this.name;
    }

    public String getSSN(){
        return this.SSN;
    }


    public void setName(String name){
        this.name = name;
    }

    public void setSSN(String SSN){
        this.SSN = SSN;
    }


    public String convertNameUpperCase(String name) { return name.toUpperCase();}
}

class CorporateHolder extends AccountHolder{
    private String contact;

    public CorporateHolder(int ID, String address, String contact) {
        super(ID, address);
        this.contact = contact;
    }

    public String getContact(){
        return this.contact;
    }


    public void setContact(String contact){
        this.contact = contact;
    }
}
