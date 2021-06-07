package com.cognizant;

import java.util.Date;
import java.util.Objects;

public class IceCreamFactory {
    //constant
    private final double pricePerTub = 1.49;

    //instance variables/properties
    private int  num_tubs; // 48 fl oz ice cream tubs/cartons
    private String flavor;
    private double price;
    private boolean orderProcessed;
    private boolean orderShipped;
    private Date orderDate;
    private Date shippedDate;
    private Address shippingAddress;
    private Address billingAddress;
    private boolean paymentReceived;
    private Date paymentReceivedDate;
    private String paymentMadeReference;

    public IceCreamFactory(int num_tubs, String flavor, Date orderDate, Address shippingAddress,
                           Address billingAddress) {
        this.num_tubs = num_tubs;
        this.flavor = flavor;
        this.orderDate = orderDate;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.price = 0;
        this.orderProcessed = false;
        this.orderShipped = false;
        this.paymentReceived = false;
        this.paymentMadeReference = "";
        this.price = pricePerTub * num_tubs;
    }

    public IceCreamFactory() {
    }

    // Getters and Setters
    public double getPricePerTub() {
        return pricePerTub;
    }

    public int getNum_tubs() {
        return num_tubs;
    }

    public void setNum_tubs(int num_tubs) {
        this.num_tubs = num_tubs;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public boolean isPaymentReceived() {
        return paymentReceived;
    }

    public void setPaymentReceived(boolean paymentReceived) {
        this.paymentReceived = paymentReceived;
    }

    public Date getPaymentReceivedDate() {
        return paymentReceivedDate;
    }

    public void setPaymentReceivedDate(Date paymentReceivedDate) {
        this.paymentReceivedDate = paymentReceivedDate;
    }

    public String getPaymentMadeReference() {
        return paymentMadeReference;
    }

    public boolean isOrderProcessed() {
        return orderProcessed;
    }

    public void setOrderProcessed(boolean orderProcessed) {
        this.orderProcessed = orderProcessed;
    }

    public boolean isOrderShipped() {
        return orderShipped;
    }

    public void setOrderShipped(boolean orderShipped) {
        this.orderShipped = orderShipped;
    }

    public void setPaymentMadeReference(String paymentMadeReference) {
        this.paymentMadeReference = paymentMadeReference;
    }

    /* instance methods */
    public void updatePrice() {
        price = num_tubs * pricePerTub;
    }
    public void generateInvoice(){
        System.out.println("Here is the invoice to be mailed to " + this);

    }

    public void processOrder() {
        if(orderProcessed == false) {
            System.out.println("Send instructions to production about order with " +
                    "order details :" + toString());
            orderProcessed = true;
        }
    }


    public void ship() {
        if (orderProcessed == false) {
            System.out.println("Order not yet processed. Starting to process order");
            processOrder();
        } else if (orderShipped == false) {
            Date d1 = new Date();
            setShippedDate(d1);
            orderShipped = true;
            System.out.println("Order Shipped. Order Details: " + this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IceCreamFactory)) return false;
        IceCreamFactory that = (IceCreamFactory) o;
        return Double.compare(that.getPricePerTub(), getPricePerTub()) == 0 && getNum_tubs() == that.getNum_tubs() && Double.compare(that.getPrice(), getPrice()) == 0 && isOrderProcessed() == that.isOrderProcessed() && isOrderShipped() == that.isOrderShipped() && isPaymentReceived() == that.isPaymentReceived() && Objects.equals(getFlavor(), that.getFlavor()) && Objects.equals(getOrderDate(), that.getOrderDate()) && Objects.equals(getShippedDate(), that.getShippedDate()) && Objects.equals(getShippingAddress(), that.getShippingAddress()) && Objects.equals(getBillingAddress(), that.getBillingAddress()) && Objects.equals(getPaymentReceivedDate(), that.getPaymentReceivedDate()) && Objects.equals(getPaymentMadeReference(), that.getPaymentMadeReference());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPricePerTub(), getNum_tubs(), getFlavor(), getPrice(), isOrderProcessed(), isOrderShipped(), getOrderDate(), getShippedDate(), getShippingAddress(), getBillingAddress(), isPaymentReceived(), getPaymentReceivedDate(), getPaymentMadeReference());
    }

    @Override
    public String toString() {
        return "IceCreamFactory{" +
                "pricePerTub=" + pricePerTub +
                ", num_tubs=" + num_tubs +
                ", flavor='" + flavor + '\'' +
                ", price=" + price +
                ", orderProcessed=" + orderProcessed +
                ", orderShipped=" + orderShipped +
                ", orderDate=" + orderDate +
                ", shippedDate=" + shippedDate +
                ", shippingAddress=" + shippingAddress +
                ", billingAddress=" + billingAddress +
                ", paymentReceived=" + paymentReceived +
                ", paymentReceivedDate=" + paymentReceivedDate +
                ", paymentMadeReference='" + paymentMadeReference + '\'' +
                '}';
    }
}
