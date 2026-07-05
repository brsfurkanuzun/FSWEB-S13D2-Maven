package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int number){
        number = Math.abs(number);

        int original = number;
        int reverse = 0;

        while (number > 0) {

            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;

        }

        return original == reverse;
    }
    public static boolean isPerfectNumber(int number){
        if (number < 1) {
            return false;
        }
        int sum=0;
        for(int i =1; i<number;i++){
            if(number % i == 0){
                sum+=i;
            }
        }
        return sum==number;

    }
    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        if (number == 0) {
            return "Zero";
        }

        int original = number;
        int digitCount = 0;
        while (original > 0) {
            digitCount++;
            original /= 10;
        }
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }

        String result = "";
        int reverseDigitCount = 0;
        while (reverse > 0) {
            reverseDigitCount++;

            switch (reverse % 10) {
                case 0: result += "Zero "; break;
                case 1: result += "One "; break;
                case 2: result += "Two "; break;
                case 3: result += "Three "; break;
                case 4: result += "Four "; break;
                case 5: result += "Five "; break;
                case 6: result += "Six "; break;
                case 7: result += "Seven "; break;
                case 8: result += "Eight "; break;
                case 9: result += "Nine "; break;
            }

            reverse /= 10;
        }

        // Kaybolan sıfırları ekle
        while (reverseDigitCount < digitCount) {
            result += "Zero ";
            reverseDigitCount++;
        }

        return result.trim();
    }
}
