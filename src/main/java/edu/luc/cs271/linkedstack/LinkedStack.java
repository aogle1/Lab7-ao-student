package edu.luc.cs271.linkedstack;

import java.util.EmptyStackException;
import java.util.List;
import java.util.ArrayList;


public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  // TODO why don't we need an explicit constructor?
  //You're not setting a class, there is an implicit constructor with objects.

  @Override
  public E push(final E obj) {
    top = new Node<>(obj, top);
    return obj;

  }

  @Override
  public E peek() {
      if (top != null) {
          return top.data;
      } else {
          throw new EmptyStackException();
      }
  }
  @Override
  public E pop() {
      if (top != null){
          top = top.next;
          return top.data;
      }
      return top.data;
  }

  @Override
  public boolean isEmpty() {
      return top == null;
  }

  @Override
  public List<E> asList() {
      List<E> nodeList = new ArrayList<>();
      while (top != null) {
          nodeList.add(top.data);
          top = top.next;
      }
      return nodeList;
  }


    // TODO implement using an ArrayList.  Populate the ArrayList with the stack values, without deconstructing the stack!
    // TODO add any instance variable(s) required to support this

  }

