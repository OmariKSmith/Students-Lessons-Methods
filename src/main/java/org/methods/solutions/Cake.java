package org.methods.solutions;

//!                             Declare the appropriate accessor and mutator
//!                             methods for this class. Output literal values to console.
class Cake {
    boolean inStock = true;
    double price = 45.50;
    int layers = 3;
    char size = 'L';
    long itemNumber = 83454544456794366L;

    public static void main(String[] args) {
        Cake cake = new Cake();
        System.out.println(cake.isInStock() + " " + cake.getPrice() + " " + cake.getLayers() + " " + cake.getSize() + " " + cake.getItemNumber());
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLayers() {
        return layers;
    }

    public void setLayers(int layers) {
        this.layers = layers;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public long getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(long itemNumber) {
        this.itemNumber = itemNumber;
    }
}
