package org.methods.solutions;

//!                             Declare the appropriate accessor and mutator
//!                             methods for this class. Output literal values to console.
class Person {

    double height = 5.9;
    int age = 28;
    char gender = 'M';
    double weight = 180;

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getHeight() + " " + person.getAge() + " " + person.getGender()+ " " + person.getWeight());
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
