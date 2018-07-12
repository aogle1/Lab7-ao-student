# COMP 271 002 F17 Lab 5 (Week 7)

# Questions


1. Answer the following questions:
   - Why does `LinkedStack` not require an explicit constructor?
      - LinkedStack has an implicit constructor in the JVM. 
   - What is the time and (extra) space complexity of each of the `LinkedStack` methods, as well as `ReverseLines.main`?
      - They are constant time operations with the worst case run-time complexity beign O(1). 
   - How else (not using `Node`) could we have implemented `LinkedStack` in such a way that it is still based on a linked list but the `asList` method uses constant time and space?
      - It could have been implemented with String<>.
   - Is it better for `push` and `pop` to return the item or the stack itself? Briefly discuss the pros and cons of each design.
      - It is better to pop to return an item or stack. Push doesn't return an item. Push adds an item to the top of a stack, Pop removes. Push can have overflow when trying to push an item on a full stack, pop can have underflow when popping an empty stack.
