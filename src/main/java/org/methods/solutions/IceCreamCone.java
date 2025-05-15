package org.methods.solutions;

//!                             Declare the appropriate accessor and mutator
//!                             methods for this class. Output literal values to console.
class IceCreamCone {
    boolean inStock = true;
    int scoops = 2;
    char flavors = 'V';
    double price = 4.35;
    long itemNumber = 4857474639L;

    public static void main(String[] args) {
        IceCreamCone cone = new IceCreamCone();
        System.out.println(cone.isInStock() + " " + cone.getPrice() + " " + cone.getFlavors()+ " " + cone.getPrice()+ " " + cone.getItemNumber());
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public int getScoops() {
        return scoops;
    }

    public void setScoops(int scoops) {
        this.scoops = scoops;
    }

    public char getFlavors() {
        return flavors;
    }

    public void setFlavors(char flavors) {
        this.flavors = flavors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(long itemNumber) {
        this.itemNumber = itemNumber;
    }
}
