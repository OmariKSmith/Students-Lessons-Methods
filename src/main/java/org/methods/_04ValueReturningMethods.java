package org.methods;

public class _04ValueReturningMethods {

//-                              VALUE RETURNING METHODS


//-                 Value methods return the results of the operations in the method body.
//-                 Value methods can have 0 or many parameters.
//-                 The method call of a value method is equal to the returned result.




    //` RETURN TYPE         NAME                PARAMETERS                      BODY
    int                 addNumbers          (int num1, int num2)              {

        return num1+num2;
    }

//`             The return type of a value returning method is equal to the return value.
//`                        Methods can have 0 or many parameters





//-                                         CHECK POINT




    public static void main(String[] args) {
        _04ValueReturningMethods obj  = new _04ValueReturningMethods();

        int num1 = 5;
        int num2 = 4;
        int sum = obj.addNumbers(num1,num2);

        System.out.println(sum); // output  9


        int num3 = sum;
        int num4 = obj.addNumbers(5,5);
        int sum2 = obj.addNumbers(num3,num4);

        //`What is the value of sum2?

    }
}
