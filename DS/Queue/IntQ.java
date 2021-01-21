package Queue;

public class IntQ{

	//first in first out
	//so adding item inside a queue is called enqueue
	//or whenever we want to get an item from a Q is called dequeue;
        
   // front is focusing on specific index that have been just added in the array //whenever we want to add a item with the help of front. //front is used to enqueue an item
   // rear is the the tale of array where the firt item was added  //rear is used to dequeue an item  

   private int [] q;
   private int size;
   private int front;
   private int rear;
   int total;
    int hello;   
       public IntQ()
       

       {   
    	   hello  = 0;
             size = 100;
             total =  0 ;
             front =  0 ;
             rear = 0;
             q = new int [size]; 
       }

       public IntQ(int size)

       {
             this.size = size;
             total =  0 ;
             front =  0 ;
             rear = 0;
             q = new int [this.size];     
       }

       public boolean enqueue(int item)

       {
            if(isFull())
            {
              return false;
            }else{
              total++;
              q[rear] = item;
              rear = (rear+1) % size;
              return true;
            }

       }
       public int dqueue()

       {

	         int atom = q[front];
	         total--;
	         front = (front+1) % size;
	         return atom;

       }

       public boolean isFull()

       {
	         if(size == total){
	             return true;
	         }else{
	             return false;
	         }          
       }
       
       public void showAll() 
       {
//		    	   int f = hello;
		    	   if(total != 0 ) {
		    		   for(int i = 0 ; i< total;i++) {
		    			   System.out.println(" " +q[i]);
//		    			   f  = (f+1) % size;
    		   }
    	   }
       }

}