package com.example.homework.Observer_pattern;

public class Member implements Observer {
    private String memberName;

    public Member(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public void update(String productName, double newPrice) {
        System.out.println("Dear " + memberName + ", the product " + productName
                + " is now priced at $" + newPrice);
    }
}
