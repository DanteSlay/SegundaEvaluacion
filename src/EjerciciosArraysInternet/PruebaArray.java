package EjerciciosArraysInternet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PruebaArray
{
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      ArrayList<Integer> arr = new ArrayList<>();
      for (int i = 0; i < 5; i++) {
        arr.add(in.nextInt());
      }

      System.out.println(arr);
      System.out.println(arr.size());
  }
  }

