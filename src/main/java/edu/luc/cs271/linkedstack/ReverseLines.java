package edu.luc.cs271.linkedstack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseLines {

  public static void main(final String[] args) {
    // TODO read successive input lines until EOF, then print out in reverse order
    LinkedStack<String> stack = new LinkedStack<>();
    final Scanner input = new Scanner(System.in);
    while (input.hasNextLine()) {

      final String line = input.nextLine();
      stack.push(line);
      }
      while(!Stack.isEmpty(){
      System.out.println(stack.pop())
    }




  }
}
