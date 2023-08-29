package org.example;

public class Policy {

    private String planName;
    private int planAmount;

    public Policy() {
    }

    public Policy(String planName, int planAmount) {
        this.planName = planName;
        this.planAmount = planAmount;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public int getPlanAmount() {
        return planAmount;
    }

    public void setPlanAmount(int planAmount) {
        this.planAmount = planAmount;
    }
}
