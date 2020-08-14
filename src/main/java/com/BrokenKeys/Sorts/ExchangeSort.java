package com.BrokenKeys.Sorts;

public class ExchangeSort{
    //private static int[] list;
    public static boolean toFlip(int pos, int[] list){//basically return whether or not to flip with the position in front of it.
        if(list[pos]>list[pos+1] && !(list[pos] == list[pos+1])){
            return true;
        }
        return false;
    }
    public static void flip(int x, int[] list){
        int temp = list[x];
        list[x] = list[x+1];
        list[x+1] = temp;
        System.out.println("flipped");
    }
    public static boolean sorted(int[] list){
        for(int x = 0; x < list.length-1; x++){
            if(!(list[x]<=list[x+1])){
                return false;
            }
        }
        return true;
    }
    public static int[] Esort(int[] list){
        int[] out = list;
        while(!sorted(out)){
            
            for(int x = 0; x < list.length-1; x++){
                if(toFlip(x,out)){
                    System.out.println(x);
                    flip(x,out);
                }
            }
            System.out.println("stop1");
        }
        return out;
    }
    
}