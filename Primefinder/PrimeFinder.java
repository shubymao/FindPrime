package Primefinder;

import java.math.BigInteger;

public class PrimeFinder {



BigInteger[] prime;
int counter;

PrimeFinder(int largestN){
    prime= new BigInteger[largestN];
    prime[0]=new BigInteger("2");
    prime[1]=new BigInteger("3");
    counter=2;
}


//this function return the nth prime
public BigInteger prime(int index){
    int status=0;
    BigInteger currentterm = prime[counter-1];
    BigInteger range;
    while(counter<index){
        status=0;
        currentterm=currentterm.add(new BigInteger("2"));
        //using a unique thm that there will be no factor elimination within the square of that term
        //i.e when you are at the term 11 there won't be any number elimination before 121;
        //so the current number square root will be a deciding factor to stop or keep checking
        range=currentterm.sqrt();
        for(BigInteger term: prime){
            if(term.compareTo(range)>0){
                status=0;
                break;
            }
            else if(currentterm.mod(term).equals(new BigInteger("0"))){
                status=1;
                break;
            }
        }
        if(status==0){
            prime[counter]=currentterm;
            counter++;
        }
    }
    return prime[index-1];
}
}
