package com.BrokenKeys.Sorts;
import com.BrokenKeys.Sorts.ExchangeSort;
import java.util.Random;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Random rand = new Random(); //instance of random class
        int upperbound = 25;
        int listLength = 30;
        int[] io = new int[listLength];
        for(int i = 0; i < listLength; i++){
            io[i] = rand.nextInt(upperbound);
        }
        int[] oi = ExchangeSort.Esort(io);//Sort it
        for(int x = 0; x < oi.length; x++){
            System.out.println(oi[x]);
        }
    }
}
