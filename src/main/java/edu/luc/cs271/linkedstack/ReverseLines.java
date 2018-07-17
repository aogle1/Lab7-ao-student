package edu.luc.cs271.linkedstack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseLines {

  public static void main(final String[] args) {
      final Scanner input = new Scanner(System.in);
      printReverse(input);
    }

  private static void printReverse(final Scanner input) {
    if(!input.hasNextLine()){
      return;
    }
    final String line = input.nextLine();
    System.out.println(line);

    printReverse(input);
    System.out.println(line);



    // TODO recursively read and print successive input lines until EOF, then print them out in reverse order
    //DONE
  }
}
