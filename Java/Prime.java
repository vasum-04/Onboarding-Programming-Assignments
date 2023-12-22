package Java;

public class Prime {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int number = 31;  
        System.out.println("Is Prime: " + isPrime(number));
    }
}
