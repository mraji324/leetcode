import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class RSA1 {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        System.out.println("Enter a prime number:");
        BigInteger p = sc.nextBigInteger();

        System.out.println("Enter another prime number:");
        BigInteger q = sc.nextBigInteger();

        BigInteger n = p.multiply(q);

        // phi(n) = (p-1)(q-1)
        BigInteger phi = p.subtract(BigInteger.ONE)
                          .multiply(q.subtract(BigInteger.ONE));

        BigInteger e = generateE(phi);

        BigInteger d = e.modInverse(phi);

        System.out.println("Encryption keys are: " + e + ", " + n);
        System.out.println("Decryption keys are: " + d + ", " + n);
    }

    public static BigInteger generateE(BigInteger phi) {

        BigInteger e;

        do {
            e = new BigInteger(phi.bitLength(), random);
        } 
        while (e.compareTo(BigInteger.ONE) <= 0 
               || e.compareTo(phi) >= 0 
               || !e.gcd(phi).equals(BigInteger.ONE));

        return e;
    }
}