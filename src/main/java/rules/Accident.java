package rules;

/**
 * Created by Max on 10/22/2017.
 */
public class Accident {
    private Double payment;
    private Boolean isApplicable;

    public Accident(){};

    public Accident(Double payment) {
        this.payment = payment;
    }

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public Boolean getApplicable() {
        return isApplicable;
    }

    public void setApplicable(Boolean applicable) {
        isApplicable = applicable;
    }
}
