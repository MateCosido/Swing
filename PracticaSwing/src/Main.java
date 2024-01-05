import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        BigInteger resultadoN = new BigInteger("2023").pow(1);

        long N = 100;

        BigInteger var_A = BigInteger.ONE;
        BigInteger var_B = BigInteger.ONE;
        BigInteger var_C = BigInteger.ONE;
        BigInteger var_D = BigInteger.ONE;

        for (BigInteger i = BigInteger.ONE; i.compareTo(resultadoN) <= 0; i = i.add(BigInteger.ONE)) {
            BigInteger resultado = var_D.multiply(BigInteger.valueOf(3))
                    .add(var_C)
                    .add(var_B.multiply(BigInteger.valueOf(4)))
                    .add(var_A);

            var_A = var_B;
            var_B = var_C;
            var_C = var_D;
            var_D = resultado;
        }

        BigInteger resultadoFinal = var_D.mod(BigInteger.TEN.pow(10));

        System.out.println("A ver si funciona= " + resultadoFinal);
    }
}