import java.util.Scanner;

class Basics {
    public static void main(String[] args) {
        // OUTPUT
        System.out.println("hello, world!");

        System.out.println("-------------------------------------");

        // DATA TYPES
        byte num = 100;
        System.out.println("Size of byte " + num + " is " + Byte.BYTES + " bytes.");

        short num2 = 30000;
        System.out.println("Size of short " + num2 + " is " + Short.BYTES + " bytes.");

        int num3 = 1000000000;
        System.out.println("Size of int " + num3 + " is " + Integer.BYTES + " bytes.");

        long num4 = 1000000000000L;
        System.out.println("Size of long " + num4 + " is " + Long.BYTES + " bytes.");

        float num5 = 1.99142342342f;
        System.out.println("Size of float " + num5 + " is " + Float.BYTES + " bytes.");

        double num6 = 1.3423423423423432432;
        System.out.println("Size of double " + num6 + " is " + Double.BYTES + " bytes.");

        char ch = 'a';
        System.out.println("Size of char " + ch + " is " + Character.BYTES + " bytes.");

        boolean is_true = true;
        System.out.println("Size of boolean " + is_true + " is " + 1 + " byte.");

        System.out.println("-------------------------------------");

        // OPERATORS

        // ARITHMETIC
        int a = 3;
        System.out.println(a);
        int b = a + 3;
        System.out.println(b);
        int c = b - 3;
        System.out.println(c);
        int d = c * 2;
        System.out.println(d);
        int e = d / 3;
        System.out.println(e);
        int f = e % 2;
        System.out.println(f);

        System.out.println("-------------------------------------");

        // UNARY
        int g = -f;
        System.out.println(g);
        int h = +g;
        System.out.println(h);
        boolean is_false = !is_true;
        System.out.println(is_false);

        System.out.println("-------------------------------------");

        // RELATIONAL OPERATORS
        boolean is_equal = 3 == 4;
        System.out.println(is_equal);
        boolean is_not_equal = 3 == 4;
        System.out.println(is_not_equal);
        boolean is_greater_than = 3 > 4;
        System.out.println(is_greater_than);

        boolean is_less_than = 3 < 4;
        System.out.println(is_less_than);

        boolean is_greater_than_or_equal_to = 4 > 5;
        System.out.println(is_greater_than_or_equal_to);

        boolean is_less_than_or_equal_to = 4 < 5;
        System.out.println(is_less_than_or_equal_to);

        System.out.println("-------------------------------------");

        // LOGICAL OPERATORS
        boolean are_both_true = 2 < 3 && 3 < 4;
        System.out.println(are_both_true);

        boolean are_either_of_them_true = 2 < 3 && 3 > 4;
        System.out.println(are_either_of_them_true);

        System.out.println("-------------------------------------");

        // ASSIGNMENT OPERATOR
        int i = 6;
        int j = 2;
        System.out.println(i);

        i += j;
        System.out.println(i);

        i -= j;
        System.out.println(i);

        i *= j;
        System.out.println(i);

        i /= j;
        System.out.println(i);

        i %= j;
        System.out.println(i);

        System.out.println("-------------------------------------");

        // TERNARY OPERATORS
        int num7 = 5;
        int num8 = 6;
        char num9 = (num7 < num8) ? 't' : 'f';
        System.out.println("is num7 > num8: " + num9);
        System.out.println("-------------------------------------");

        // STRINGS
        String name = "charith";
        System.out.println("the name is " + name);

        System.out.println("character at 0th position: " + name.charAt(0));
        System.out.println("character at 1th position: " + name.charAt(1));
        System.out.println("character at 2th position: " + name.charAt(2));
        System.out.println("character at 3th position: " + name.charAt(3));
        System.out.println("character at 4th position: " + name.charAt(4));
        System.out.println("character at 5th position: " + name.charAt(5));
        System.out.println("character at 6th position: " + name.charAt(6));

        System.out.println("Substring starting at letter a: " + name.substring(2));
        System.out.println("Substring between at 0th and final position: " + name.substring(1, 6));

        String firstname = "sai charith";
        String lastname = "palabindhela";

        System.out.println("fullname is: " + firstname + " " + lastname);

        boolean isStringEqual = name.equals(firstname.substring(4));
        System.out.println(isStringEqual);

        System.out.println("-------------------------------------");

        // INPUT/OUTPUT

        Scanner scanner = new Scanner(System.in);
        int customer_id = scanner.nextInt();
        System.out.println("customer id: " + customer_id);

        String customer_name = scanner.nextLine();
        System.out.println("customer name: " + customer_name);

        float customer_height = scanner.nextFloat();
        System.out.println("customer height: " + customer_height + " cm");

        String customer_gender = scanner.nextLine();
        System.out.println("customer sex: " + customer_gender);

        System.out.println("-------------------------------------");

        // TYPE CASTING
        // IMPLICIT
        int x = 10;
        double y = x;

        System.out.println(x);
        System.out.println(y);

        // EXPLICIT
        double x2 = 10.1;
        // int y2 = x2; shows error due to lossy conversion of decimal places
        int y2 = (int) x2;
        System.out.println(x2);
        System.out.println(y2);

        System.out.println("-------------------------------------");

        // CONSTANTS

        final int const_num = 3;
        // const_num = 4; error: cannot assign a value to final variable const_num
        System.out.println(const_num);

        System.out.println("-------------------------------------");

        // ARRAYS

        int[] arr1 = new int[5];
        arr1[0] = 0;
        arr1[1] = 1;
        arr1[2] = 2;
        arr1[3] = 3;
        arr1[4] = 4;

        System.out.println("length of the array is: " + arr1.length);

        // 2D ARRAYS

        int[][] twod_arr1 = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 }, { 4, 5, 6 } };
        int[] zeroth_index = twod_arr1[0];
        System.out.println("first element on zeroth array: " + zeroth_index[0]);
        System.out.println("first element on zeroth array: " + twod_arr1[0][0]);

        System.out.println("-------------------------------------");

        // CONDITIONAL STATEMENTS

        // Assignment - 1 (if-else)
        // Given an age, print "adult" if age >= 18, or println "underage"
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("adult");
        } else {
            System.out.println("underage");
        }

        // Assignment - 2 (if- else if - else)
        // Give grades based on the given marks
        // Grade A (>=90)
        // Grade B (>=70 & <90)
        // Grade C (>=50 & <70)
        // Grade D (>=35 & <50)
        // Fail (<35)
        int marks = scanner.nextInt();

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else if (marks > 35) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }

        // Assignment - 3
        // 3 integers a, b, c
        // print the largest
        // if two or more integers are largest, program should indicate that as well
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int r = scanner.nextInt();
        if (p > q) {
            if (p > r) {
                System.out.println("p = " + p + " is largest.");
            } else {
                System.out.println("r = " + r + " is largest.");
            }
        } else if (q > p) {
            if (q > r) {
                System.out.println("q = " + q + " is largest.");
            } else {
                System.out.println("r = " + r + " is largest.");
            }
        } else {
            System.out.println("None are largest");
        }

        // Assignment - 4
        // Given a number, print which day it is of the week.
        // Assume that the weeks starts from monday and ends on sunday.
        int day_no = scanner.nextInt();
        switch (day_no) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number.");
        }

        System.out.println("-------------------------------------");

        // LOOPS
        for (int z = 1; z <= 10; z++) {
            System.out.println(z);
        }

        // Assignment - 5
        // Summation of 'n' integer inputs
        int input_number = scanner.nextInt();
        int sum = 0;
        for (int z1 = 0; z1 < input_number; z1++) {
            int value = scanner.nextInt();
            sum += value;
        }

        System.out.println("final sum is: " + sum);

        System.out.println("-------------------------------------");

        // Iterating over arrays using for each loop
        int[] arr2 = { 1, 2, 3, 4, 5 };

        for (int arr_num : arr2) {
            System.out.println(arr_num);
        }

        System.out.println("-------------------------------------");

        // WHILE LOOP
        int z2 = 3;
        while (z2 < 50) {
            System.out.println(z2);
            z2 += 3;
        }

        System.out.println("-------------------------------------");

        // DO WHILE LOOP
        // Assignment - 6
        int z3 = 4;
        do {
            System.out.println(z3);
            z3++;
        } while (z3 <= 10);

        System.out.println("-------------------------------------");

        // EXCEPTION HANDLING
        try {
            int number1 = 2;
            int number2 = 0;

            int number3 = number1 / number2;
            System.out.println(number3);
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            System.out.println("End of code...");
        }

        scanner.close();
    }
}
