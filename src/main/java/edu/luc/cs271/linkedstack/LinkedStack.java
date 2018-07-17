package edu.luc.cs271.linkedstack;

import java.util.Collections;
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
      final ArrayList<E> result = new ArrayList<>();
      populateList(top, result); // TODO replace null with the right reference
      //DONE

      return result;
  }

    private void populateList(final Node<E> curr, final List<E> result) {
      if(curr == null)
          return;
      final E a = curr.data;
      result.add(a);
      populateList(curr.next, result);
        // TODO recursively populate the list in the desired order
        //DONE?
    }



    @Override
    public List<E> asFifoList() {
        final ArrayList<E> result = new ArrayList<>();
        populateFifoList(top, result); // TODO replace null with the right reference
        //DONE
        return result;
    }

    private void populateFifoList(final Node<E> curr, final List<E> result) {
      if (curr == null) {
         Collections.reverse(result);
          return;
      }
      final  E b = curr.data;
      result.add(b);
      populateFifoList(curr.next, result);
        // TODO recursively populate the list in the desired order
        //DONE?
    }



    // TODO implement using an ArrayList.  Populate the ArrayList with the stack values, without deconstructing the stack!, lab 5
    // TODO add any instance variable(s) required to support this, lab 5

  }

