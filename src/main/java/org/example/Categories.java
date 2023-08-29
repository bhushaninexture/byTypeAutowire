package org.example;

public class Categories {

    private String name;
    private Policy policy;

    public Categories() {
    }

    public Categories(String name, Policy policy) {
        this.name = name;
        this.policy = policy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public void show() {
        System.out.println("Categories name>>" + name);
        System.out.println("Policy Name>>" + policy.getPlanName());
        System.out.println("Policy Amount>>" + policy.getPlanAmount());
    }
}
