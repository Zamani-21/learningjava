public class HelloWorld {
    public static void main(String[] args) {
        String name = "John ";
        String name2 = "Njoroge";
        String fullName = name + name2;// + used to add a variable to another variable
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";// String length
        int myNum = 15;// myNum is an identifier
        int myNum2 = 21;// the word 'final' was removed, something to do with a compound assignment
        myNum2 = 20;
        float myFloat = 5.99f;
        char myLetter = 'd';
        boolean myBool = true;
        int x = 5;
        int y = 10;
        int a = 5, b = 10, z = 50;// i have declared variables of the same type using a comma separated list
        int f, c, e;
        f = c = e = 50;
        short myNum3 = 5000;// this is a primitive number type
        float f1 = 35e3f;// this is a scientific number
        double d1 = 12E4d;// this is a scientific number
        boolean isJavaFun = true;
        boolean isFishTasty = false; // boolean value
        int myInt = 9;
        double myDouble = myInt;// widening casting is automatic int to double
        /* all above are variables, they store data values */
        System.out.println("Hello World");
        /* this code will print Hello world2 on the screen output, how awesome */
        System.out.println("I am learning");
        System.out.println("Getting a grisp of it");
        System.out.println(3 + 3); // this is a number
        System.out.println("Hello " + name);// introduced the + to combine text and variable
        System.out.println(fullName);
        System.out.println("The length of the txt is:" + txt.length()); // outpit is 26
        System.out.println(myNum);
        System.out.println(myNum2);
        System.out.println(myFloat);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(x + y);// sum of x and y
        System.out.println(a + b + z);
        System.out.println(f + c + e);
        System.out.println(myNum3);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(isJavaFun);// true
        System.out.println(isFishTasty);// false
        System.out.println(myInt);
        System.out.println(myDouble);
    }
}
