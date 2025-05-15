package org.methods.solutions;

//!                             Declare the appropriate accessor and mutator
//!                             methods for this class. Output literal values to console.
public class LiteralAssignment {

    boolean isMoving = true;
    int  count = 5;
    char gender = 'F';
    long accountNumber = 12315456456456456L;
    float poolDepth = 12.5f;
    double oceanDepth = 1200000151.2546;

    public static void main(String[] args) {

    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getPoolDepth() {
        return poolDepth;
    }

    public void setPoolDepth(float poolDepth) {
        this.poolDepth = poolDepth;
    }

    public double getOceanDepth() {
        return oceanDepth;
    }

    public void setOceanDepth(double oceanDepth) {
        this.oceanDepth = oceanDepth;
    }
}
