import java.math.BigInteger;

public class anotaciones {
    public static void main(String[] args) {
        long N = 2023;
        BigInteger modValue = BigInteger.TEN.pow(10);

        BigInteger var_A = BigInteger.ONE;
        BigInteger var_B = BigInteger.ONE;
        BigInteger var_C = BigInteger.ONE;
        BigInteger var_D = BigInteger.ONE;

        for (BigInteger i = BigInteger.ONE; i.compareTo(BigInteger.valueOf(N)) <= 0; i = i.add(BigInteger.ONE)) {
            BigInteger resultado = var_D.multiply(BigInteger.valueOf(3))
                    .add(var_C)
                    .add(var_B.multiply(BigInteger.valueOf(4)))
                    .add(var_A);

            var_A = var_B;
            var_B = var_C;
            var_C = var_D;
            var_D = resultado.mod(modValue);
        }

        System.out.println("Resultado final: " + var_D);
    }
}
/**
 Para calcular los últimos 10 dígitos de una operación que involucra números muy grandes, como
 2023 a la 100, puedes aplicar el módulo de 10 a la 10 en cada paso del bucle para mantener
 los números en un rango manejable.
 En este código, se utiliza resultado.mod(modValue) en cada iteración del bucle para mantener los números
 en un rango manejable. Esto debería permitirte calcular los últimos 10 dígitos de la operación de manera
 más eficiente y evitando desbordamientos de memoria.
 **/