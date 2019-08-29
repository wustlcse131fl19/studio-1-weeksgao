package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("What is the first number?");
        int n2 = ap.nextInt("What is the second number?");
        double result = (((double) n1)+((double) n2))/2;
        System.out.println(result);
    }
}