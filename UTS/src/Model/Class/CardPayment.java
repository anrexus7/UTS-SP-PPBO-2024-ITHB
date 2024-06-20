package Model.Class;

import Model.Enum.CustomerType;

import java.util.Date;

public class CardPayment extends Payment{
    private String cardType;
    private String cardNumber;

    public CardPayment() {
    }

    public CardPayment(Integer transactionNumber, double amount, Date dateOfTransaction, String cardType, String cardNumber) {
        super(transactionNumber, amount, dateOfTransaction);
        this.cardType = cardType;
        this.cardNumber = cardNumber;
    }

    public double proccessPayment(CustomerType tipeMember, String tipeCard, double amount, Date stay){
        if(tipeCard.equalsIgnoreCase("credit")){
            amount*=1.02;
        }

        if(tipeMember.equals(CustomerType.VIP)){
            return amount*0.25;
        }else {
            return amount*0.1;
        }
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
