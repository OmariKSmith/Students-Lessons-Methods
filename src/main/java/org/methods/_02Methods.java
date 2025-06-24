package org.methods;

public class _02Methods {
//-                                               METHODS

//-                         Program behaviours are represented by methods.

//-                         Methods are blocks of code that change or retreive the state of variables.

//-                         There are two types of methods in Java: void and value returning.

//-                         Methods have to be 'declared' before they can change or retreive data.


//-                                              METHOD DECLARATION


//`     RETURN TYPE         NAME                PARAMETERS                      BODY START BRACE
        int             addNumbers              (int num1, int num2)            {

            //`RETURN VALUE
            return num1 + num2;

//`     BODY END BRACE
        }



/*`
`      RETURN TYPE: Tells Java if a value will be returned from the method and the value type returned.

`      NAME:        A unique identifier that gives both Java and programmers
`                   the ability to distinguish between methods.
`                   (Always camelCase)
`                   (Must start with letter, underscore, or dollar sign)

`      PARAMETERS:  Parameters are the data types a method expects to works with.
`

`      BODY:        The body is where the method logic is contained.
`
`      RETURN VALUE: The return value is the method logic result / the value returned from the method.
`
` */


//-                                         CHECKPOINT



//-                         Identify the return type in this method
    void setConePrice(double price){

    }


//-                         Identify the name in this method
    int getViews(){
        return 20;
    }


//-                         How parameters are in this method?
    void setPassword(String password){

    }


    //-                         Identify the return type in this method
    String getFirstName(){
        return "Sally";
    }


    //-                         Identify the name in this method
    int getBalance(){
        return 20;
    }


    //-                         How parameters are in this method?
    void login(String userName, String password){

    }





/*                              There are two types of methods in Java:
                                    'void' and 'value returning'

                                   What type of method is this one?                               */


    double getConePrice(int scoops){
        return 1.50 * scoops;
    }




/*`                             There are two types of methods in Java:
`                                     'void' and 'value returning'

`                                   What type of method is this one?                               */


    void showViews(int views){
        System.out.println("This movie has " + views + " views");
    }





/*                              There are two types of methods in Java:
                                     'void' and 'value returning'

                                    What type of method is this one?                               */


    String welcomeMessage(String customerName){

        return "Hello " + customerName;
    }






/*`                             There are two types of methods in Java:
`                                   'void' and 'value returning'

`                                  What type of method is this one?                                */


    double bankBalance(double amount){
        double balance =500;
        return amount + balance;
    }






/*                          There are two types of methods in Java:
                                'void' and 'value returning'

                              What type of method is this one?                               */


    void pickupWoodBlock(){
        System.out.println("added 1 wood block");
    }



}