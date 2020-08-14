# SortingAlgorithims  
Me tumbling through algorithims.  
  
## ExchageSort  
So the way this is going to work is so:  
```java
int[] list; // this is the list to sort
```
If you want, think of it like a moving window. 2 long, and starts from 0 and goes to `list.length-1`.  
And you then sort each window independently from the others.  
And then you iterate through the list as many times as possible.  
That's pretty much it.  
