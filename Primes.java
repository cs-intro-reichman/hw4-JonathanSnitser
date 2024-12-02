public class Primes {
    public static void main(String[] args) {
        final int finalDigit = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[finalDigit + 1];
        int i = 2;
        while (i < isPrime.length) {
            isPrime[i] = true;
            i++;
        }
        i = 4;
       while (i < isPrime.length) {
        isPrime[i] = false;
        i += 2;
       }
       i = 6;
       while (i < isPrime.length) {
        isPrime[i] = false;
        i += 3;
       }
       i = 10;
       while (i < isPrime.length) {
        isPrime[i] = false;
        i += 5;
       }

        System.out.println("Prime numbers up to " + finalDigit + ":");
        int counter = 0;
        i = 0;
        while (i < isPrime.length) {
            if ( isPrime[i]) {
                System.out.println(i);
                counter++;
            }
            i++;
        }
        double percent = ((double) counter / (double) finalDigit) * 100;
        System.out.println("There are " + counter + " primes between 2 and " + finalDigit +
                           " (" + (int) percent + "% are primes)");
    }
}