import java.util.Scanner;

public class RewardValue {
 private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_CONVERSION_RATE; // Calculate miles value
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE; // Calculate cash value
    }

    // Returns the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Returns the miles value
    public double getMilesValue() {
        return milesValue;
    }
}

