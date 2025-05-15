package org.methods;

public class _05LocalVariables {

//-                                 LOCAL VARIABLES AND METHOD SCOPE


//-                     Method scope is the body of the method.
//-                     Local variables are variables declared inside the method body.
//-                     Local variables DO NOT EXIST OUTSIDE the method scope.




    double price = 20;   //`instance variable

    void showCostMethod(double productPrice, double tax){
        //`local variable
        double cost = productPrice + tax;

        System.out.println(cost);
    }



//-                                         CHECK POINT




    public static void main(String[] args) {
        _05LocalVariables obj  = new _05LocalVariables();

        double tax = .1;

        obj.showCostMethod(obj.price, tax);


        //`Is obj.price a local or instance variable?

        //`Is tax a local or instance variable?

    }




//    Identify the instance and local variables. Explain their scope.

    int walkingSpeed = 5;

    void sprint(){
        int speedIncrease = 25;
        walkingSpeed = walkingSpeed + speedIncrease;
    }







//`    Identify the instance and local variables. Explain their scope.



    void makeLadders(int sticks){
        int required = 6;
        int ladders = sticks / required;

        System.out.println("You made " + ladders + " ladders");
    }





//    Identify the instance and local variables. Explain their scope.

    int stone = 36;

    int countStoneSlabs(){
        int needed = 6;
        int slabs = stone / 6;

        return slabs;
    }








    //    Identify the instance and local variables. Explain their scope.
    int woodPlanks =24;
    int sticks = 4;
    int signs;

    int makeSigns(){
        signs = woodPlanks / sticks;
        return signs;
    }


}
