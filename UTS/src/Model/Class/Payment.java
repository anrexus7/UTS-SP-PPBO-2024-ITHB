package Model.Class;

import Model.Enum.CustomerType;

import java.util.Date;

public abstract class Payment {
    private Integer transactionNumber;
    private double amount;
    private Date dateOfTransaction;

    public Payment() {}

    public Payment(Integer transactionNumber, Date dateOfTransaction) {
        this.transactionNumber = transactionNumber;
        this.amount = 1000000;
        this.dateOfTransaction = dateOfTransaction;
    }

    public double proccessPayment(){
        return 0;
    }

    public Integer getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(Integer transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDateOfTransaction() {
        return dateOfTransaction;
    }

    public void setDateOfTransaction(Date dateOfTransaction) {
        this.dateOfTransaction = dateOfTransaction;
    }

}
