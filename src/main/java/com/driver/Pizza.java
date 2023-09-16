package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;

    private int extraCheesePrice = 80;

    private int extraToppingsPrice = 70;

    private int backPackPrice = 20;
    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway= false;
    private String bill="";

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if (this.isVeg) {
            this.price = 300;
        } else {
            this.price = 400;
            this.extraToppingsPrice = 120;
        }
        basePizzaPrice = this.price;
    }

    public int getPrice() {
        return price;
    }

    public void addExtraCheese(){
        // your code goes here
        isExtraCheeseAdded = true;
//        System.out.println("Extra cheese added");
        this.price += extraCheesePrice;

    }

    public void addExtraToppings(){
        // your code goes here
        isExtraToppingsAdded = true;
//        System.out.println("Extra Toppings added");
        this.price += extraToppingsPrice;
    }

    public void addTakeaway(){
        // your code goes here
        isOptedForTakeAway = true;
//        System.out.println("Take Away Opted");
        this.price += backPackPrice;
    }

    public String getBill(){
        // your code goes here
//        String bill = "";
        System.out.println("Base Price Of The Pizza : "+basePizzaPrice);
        
        
        if(isExtraCheeseAdded){
            bill += "Extra Cheese Added: "+extraCheesePrice+ "\n";

        }
        if(isExtraToppingsAdded){
            bill += "Extra Toppings Added: "+extraToppingsPrice+ "\n";

        }
        if(isOptedForTakeAway){
            bill += "Paper Bag Added: "+backPackPrice+ "\n";

        }
        bill +="Total Price: "+this.price + "\n";
//        System.out.println(bill);
        return this.bill;
    }
}
