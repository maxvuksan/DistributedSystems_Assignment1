public class CalculatorServer {
    

    // Take val and push it on to the top of the stack.
    public static void pushValue(int val){


    }

    /*
        operator is one of the following...

        "min" - push the min value of all the popped values;
        "max" - push the max value of all the popped values
        "lcm" - push the least common multiple of all the popped values;
        "gcd" - push the greatest common divisor of all the popped values.
    */
    public static void pushOperation(String operator){

    }

    // Pop the top of the stack and return it to the client.
    public static int pop(){

        return 0;
    }

    // Return true if the stack is empty, false otherwise.
    public static boolean isEmpty(){
        return true;
    }

    // Wait millis milliseconds before carrying out the pop operation as above.
    public static int delayPop(int millis){
        return 0;
    }

}
