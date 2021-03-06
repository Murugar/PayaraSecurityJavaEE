package Finder;

import java.math.BigInteger;


public class BigIntFinder implements PrimeFinder {
    private BigInteger bi = BigInteger.ZERO;

    /**
     * This PrimeFinder strategy finds Primes using the nextProbablePrime feature of BigInteger
     * nextProbablePrime is very effective and resource caring.
     *
     * @return returns the next Prime Found
     */
    @Override
    public BigInteger nextPrime() {
        this.bi = bi.nextProbablePrime();
        return this.bi;
    }
}
