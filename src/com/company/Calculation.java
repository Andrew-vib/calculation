package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculation {

    public static void main(String[] args) throws IOException {
        float numberOne, numberTwo;
        float result = 0;
        String strRead;
        char simbol = '/';
        boolean bool = true;
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (bool){
                System.out.println("Instruction: '.' - exit, '*' - multiplication ");
                System.out.println("Enter first number ");
                strRead = bufReader.readLine();
                numberOne = Float.parseFloat(strRead);
                System.out.println("Enter arithmetic action ");
                strRead = bufReader.readLine();
                simbol = strRead.charAt(0);
                System.out.println("Enter second number ");
                strRead = bufReader.readLine();
                numberTwo = Float.parseFloat(strRead);

                if (simbol == '.') {
                    bool = false;
                } else if (simbol == '*') {
                    result = numberOne * numberTwo;
                } else if (simbol == '/') {
                    result = numberOne / numberTwo;
                } else if (simbol == '+') {
                    result = numberOne + numberTwo;
                } else if (simbol == '-') {
                    result = numberOne - numberTwo;
                } else {
                    System.out.println("Error");
                }
                System.out.println("Result: " + result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
