package assigment2;
import java.util.LinkedList; 
import java.util.Queue; 
import java.util.Stack; 
 
public class Reverse { 

 static Queue<Integer> queue; 
 
 static void Print() 
 { 
     while (!queue.isEmpty())  
     { 
         System.out.print(queue.peek() + " "); 
         queue.remove(); 
     } 
 } 
static Queue<Integer> reverseQueue(Queue<Integer> q) 
{ 
	if (q.isEmpty()) 
     return q; 

	int data = q.peek(); 
 	q.remove(); 
 	q = reverseQueue(q); 
 	q.add(data); 
       
 	return q; 
} 

public static void main(String args[]) 
{ 
 queue = new LinkedList<Integer>(); 
 queue.add(1); 
 queue.add(2); 
 queue.add(3); 
 queue.add(4); 
 queue.add(5); 
 queue.add(6); 
 queue.add(7); 
 queue.add(8); 
 queue.add(9); 
 queue.add(10); 
 queue = reverseQueue(queue); 
 Print(); 
} 
} 