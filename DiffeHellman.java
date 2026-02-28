import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.KeyPairGenerator;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
public class DiffeHellman {
    public final static int gValue=71;
    public final static int XaValue=9;
    public final static int XbValue=14;
    public static void main(String[] args) throws Exception {
        BigInteger p=new BigInteger(Integer.toString(gValue));
        BigInteger g=new BigInteger(Integer.toString(gValue));
        BigInteger Xa=new BigInteger(Integer.toString(XaValue));
         BigInteger Xb=new BigInteger(Integer.toString(XbValue));
         createKey();
         int bitLength=512;
         SecureRandom rnd=new SecureRandom();
         p=BigInteger.probablePrime(bitLength,rnd);
         g=BigInteger.probablePrime(bitLength,rnd);
         createSpace
    }
    

}
