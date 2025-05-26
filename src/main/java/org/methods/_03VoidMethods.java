package org.methods;

public class _03VoidMethods {

//-                                     VOID METHODS


//-                 Void methods just run code. They do not return values.
//-                 Like value returning methods, void methods can have 0 or many parameters
//-                 Void methods are also know as mutators.



    //` KEYWORD              NAME                         PARAMETERS                      BODY
    void                 showHeading                  (String heading)     {

        System.out.println(heading);

    }




//-                            CHECK POINT



    public static void main(String[] args) {
        _03VoidMethods obj  = new _03VoidMethods();
        String aHeading = "Welcome";

        obj.showHeading(aHeading);

        _02Methods obj2 = new _02Methods();

        obj2.showViews(27);

    }
}
