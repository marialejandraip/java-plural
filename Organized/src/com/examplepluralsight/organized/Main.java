package com.examplepluralsight.organized;

public class Main {

    public static void main(String[] args) {
        int students = 150;
        int rooms = 0;

        if(rooms!= 0 && students/rooms > 30)
            System.out.println("Crowded");

        System.out.println();
        System.out.println("** End of program **");

        System.out.println("We got organized!!");
        int myVar;
        myVar = 50;
        System.out.println(myVar);
        //When is final var only can have the value defined, if is not defined will replace for the first value assigned
        final int maxStudents = 25;
        final int someVariables;
        int someOtherVar = 100;
       // someVariables = someOtherVar;
        someVariables = maxStudents;
        //maxStudents = someOtherVar;
        System.out.println(maxStudents);
        System.out.println(someVariables);

        float floatVal = 1.0f;
        byte byteVal = 8;
        long longVal = 6;
        short result1 = (short) longVal;
        short result2 = (short)(byteVal - longVal);
        float  result3 = longVal - floatVal;

        System.out.println("Success!!");

        int value1= 10;
        int value2= 4;
        if ((value1 > value2)) {
            System.out.println("Value 1 iss bigger");
        } else {
            System.out.println("Value 2 iss bigger");
        }
        ;
        if (value1 > value2)
            System.out.println("Value 1 iss bigger");

        //double [] leftVals = {100.0d, 25.0d};
        double val1 = 100.0d;
        double val2= 0.0d;
        double results = 0.0d;
        char opCode= 'd';
 // Same if but in switch
        switch (opCode){
            case 'a':
            results = val1 + val2;
            break;
            case 's':
            results = val1 - val2;
            break;
            case 'm':
            results = val1 * val2;
            break;
            case 'd': {
            if (val2 != 0)
                results = val1 / val2;
            else
                System.out.println("Invalid val2: " + val2);
            }
            break;
            default:{
            System.out.println("Invalid opCode: " + opCode);
            results = 0.0d;
            }
            System.out.println(results);

       // if(opCode == 'a')
         //   results = val1 + val2;
        //else if (opCode == 's')
          //  results = val1 - val2;
       // else if (opCode == 'm')
         //   results = val1 * val2;
        //else if (opCode == 'd') {
          //  if (val2 != 0)
            //    results = val1 / val2;
            //else
              //  System.out.println("Invalid val2: " + val2);
        //}
        //else {
          //  System.out.println("Invalid opCode: " + opCode);
            //results = 0.0d;
        }
        //System.out.println(results);
        //FACTORIAL
        int someValue = 4;
        int Factorial = 1;
        while (someValue>1){
            Factorial *= someValue;
            someValue --;
        }
        System.out.println(Factorial);

        //WHILE
        int i = 1;
        while (i <100) {
        System.out.println(i);
        i*=2;
        }
        //Same but FOR loop
        for( int a = 1; a<100; a*=2){
            System.out.println(a);
        }

        //Arrays
        float [] otherVals = {10.0f, 10.0f, 10.0f}; // other way to make an array
        float [] theVals = new float[3];
        theVals[0] = 10.0f;
        theVals[1]=20.0f;
        theVals[2]=30.0f;

        float sumFloat = 0.0f;
        for (int index = 0; index<theVals.length; index++)
            sumFloat += theVals[index];
        System.out.println(sumFloat);
    }
}
