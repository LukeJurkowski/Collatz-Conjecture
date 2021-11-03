package main;

import java.math.BigInteger;

public class Collatz
{
    private static BigInteger number;
    private static BigInteger counter = BigInteger.ZERO;

    public Collatz(int number)
    {
        this.number = BigInteger.valueOf(number);
        count();
    }

    public Collatz(BigInteger number)
    {
        this.number = number;
        count();
    }

    private void increaseCounter()
    {
        counter = counter.add(BigInteger.ONE);
    }

    private void increaseNumber()
    {
        number = number.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
    }

    private void divideNumber()
    {
        number = number.divide(BigInteger.TWO);
    }

    private void count()
    {
        while (number.compareTo(BigInteger.ONE) > 0)
        {

//			Show every number with step
//			System.out.println(number + " " + counter);

            if (number.mod(BigInteger.TWO).equals(BigInteger.ZERO))
            {
                divideNumber();
            } else
            {
                increaseNumber();
            }
            increaseCounter();
        }
        System.out.println("It took " + counter + " steps to reach number 1");
    }

    public BigInteger returnCounterBigInt()
    {
        return counter;
    }

    public int returnCounterInt()
    {
        return counter.intValue();
    }

}
