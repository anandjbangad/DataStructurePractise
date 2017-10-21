# Recursion
How to solve Recursion?

Links
https://www.learneroo.com/modules/71/nodes/401

Two things you need to do. 
1) The definition of the problem in terms of smaller instances of itself. 
2) The base cases. 

https://www.quora.com/What-is-the-approach-to-write-a-recursive-algorithm/answer/Sachin-Kulkarni-9?srid=OJN4
In coming up with part 1, it really helps to *NOT* analyse the smaller instances to see 
what is happening at each level of recursion. Trust the recursive call that it will return 
you the correct answer. All you need to worry about is, 
given the recursive call's correctness, what is it that you need to do at that level.

Eg. When you look at factorial calculation. For part 1 , factorial can be calculated by (n-1)! * n.
And base cases are 1! = 1 and 0! =1.
With this two I create the recursive calls without thinking of the stack and stuff. How calls made, how handle. No worries.
```java
 public static int factorial(int n) {
        if (n == 0) { // check base case 
            return 1;
        } 
        if (n == 1) { // check base case
            return 1;
        } else {
            return n * factorial(n - 1); //Part 1 where broken down to sub problems
        }
    }
  ```  
  
  #####Binary Search Using Recursion
  How to start , firstly you want to find the middle element every time. You compare with middle element and according change 
  the start and end values of the array. If middle equal to num then rruen inde other wise change legth and keep calling 
  BinarySearch Function.
  Here Initially I went wrong with thinking what to return. so you know that return index if match found other wise keep 
  calling binary search with the new modified lenght of the array.
  
  //Check example to see.
  