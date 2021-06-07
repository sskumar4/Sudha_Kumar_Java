package com.cognizant;

import java.util.Objects;

public class IceCreamPOS {
    private final double scoopPrice = 0.99;
    private final double toppingPrice = 0.49;
    private String flavor;
    private String topping;
    private double price;
    private int scoops;
    private String paymentRef;
    private String paymentMethod;
    private boolean paymentReceived;
    private boolean orderDelivered;

    public IceCreamPOS(String flavor, String topping, int scoops) {
        this.flavor = flavor;
        this.topping = topping;
        this.price = scoops * scoopPrice + toppingPrice;
        this.scoops = scoops;
        this.paymentMethod = "";
        this.paymentRef= "";
        this.paymentReceived = false;
        this.orderDelivered = false;
    }
    public IceCreamPOS() {
    }

    public void calculatePrice() {
        this.price = scoops * scoopPrice + toppingPrice;
        System.out.println("price =" + price);
    }

    public void addScoop() {
        scoops++;
        this.price += scoopPrice;
    }

    public void printReceipt() {
        System.out.println("Here is the receipt" + this);
    }

    public void acceptPayment(String paymentMethod, String paymentRef) {
        setPaymentMethod(paymentMethod);
        setPaymentReceived(true);
        setPaymentRef(paymentRef);
        System.out.println("Payment Received for iceCream order + " + this);

    }
    public void deliverOrder() {
        if (paymentReceived) {
            System.out.println( this + "Ice Cream delivered to customer ...");
            setOrderDelivered(true);
        }
        else {
            System.out.println("Payment not yet received. " +
                    "Ask for and accept Payment for ice cream: " + this);
        }
    }



    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getScoops() {
        return scoops;
    }

    public double getScoopPrice() {
        return scoopPrice;
    }

    public double getToppingPrice() {
        return toppingPrice;
    }

    public String getPayamentRef() {
        return paymentRef;
    }

    public void setPaymentRef(String paymentRef) {
        this.paymentRef = paymentRef;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public boolean isPaymentReceived() {
        return paymentReceived;
    }

    public void setPaymentReceived(boolean paymentReceived) {
        this.paymentReceived = paymentReceived;
    }

    public boolean isOrderDelivered() {
        return orderDelivered;
    }

    public void setOrderDelivered(boolean orderDelivered) {
        this.orderDelivered = orderDelivered;
    }

    public void setScoops(int scoops) {
        this.scoops = scoops;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IceCreamPOS)) return false;
        IceCreamPOS that = (IceCreamPOS) o;
        return Double.compare(that.scoopPrice, scoopPrice) == 0 && Double.compare(that.toppingPrice, toppingPrice) == 0 && Double.compare(that.getPrice(), getPrice()) == 0 && getScoops() == that.getScoops() && paymentReceived == that.paymentReceived && orderDelivered == that.orderDelivered && Objects.equals(getFlavor(), that.getFlavor()) && Objects.equals(getTopping(), that.getTopping()) && Objects.equals(paymentRef, that.paymentRef) && Objects.equals(paymentMethod, that.paymentMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scoopPrice, toppingPrice, getFlavor(), getTopping(), getPrice(), getScoops(), paymentRef, paymentMethod, paymentReceived, orderDelivered);
    }

    @Override
    public String toString() {
        return "IceCreamPOS{" +
                "scoopPrice=" + scoopPrice +
                ", toppingPrice=" + toppingPrice +
                ", flavor='" + flavor + '\'' +
                ", topping='" + topping + '\'' +
                ", price=" + price +
                ", scoops=" + scoops +
                ", pyamentRef='" + paymentRef + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentReceived=" + paymentReceived +
                ", orderDelivered=" + orderDelivered +
                '}';
    }
}
