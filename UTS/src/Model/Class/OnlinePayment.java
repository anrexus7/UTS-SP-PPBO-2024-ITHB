package Model.Class;

import Model.Enum.CustomerType;

import java.util.Date;

public class OnlinePayment extends Payment{
    private String serviceProvider;

    public OnlinePayment() {
    }

    public OnlinePayment(Integer transactionNumber, double amount, Date dateOfTransaction, String serviceProvider) {
        super(transactionNumber, amount, dateOfTransaction);
        this.serviceProvider = serviceProvider;
    }

    public double proccessPayment(CustomerType tipeMember, double amount, Integer stay){
        amount *= stay;

        if(tipeMember.equals(CustomerType.VIP)){
            return amount*0.25;
        }else if(tipeMember.equals(CustomerType.REG)){
            return amount*0.1;
        }else{
            return amount;
        }
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
}
