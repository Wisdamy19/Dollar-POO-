package Secao08.DollarPOO;

public class DollarMembers {
    public double dollar;
    public double quantity;
    public double converteDollar(){
        return (dollar * quantity) ;
    }
    public double taxation(){
        return converteDollar() * 0.06;
    }
    public String toString(){
        return "Amount to be paid in reais = " + (converteDollar() + taxation());
    }

}
