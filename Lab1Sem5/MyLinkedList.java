
/**
 * @author NAME: Fathiah Husna Binti Firdaus
 * @version DATE: 21st September 2018
 * ID: 2016647044
 * GROUP: CS2305A
 * TITLE: Lab Exercise 2 :: CSC508
 */
public class MyLinkedList
{
    private class Node
    {
        private Object obj;
        private Node ptr;
        
        public Node() //default constructor
        {
            //actually it is
            //obj=ptr=null;
        }
        
        public Node (Object obj) //normal constructor
        {
            this.obj = obj;
            ptr = null;
        }
    }
    
    private Node head, tail, curr, news;
    
    public MyLinkedList()
    {
        //actually it is
        //head=tail=curr=news=null;
    }
    
    public boolean isEmpty()
    {
        /*if (head==null)
            return true;
        else
            return false;*/
        return head==null;
    }
    
    private void createNode (Object o)
    {
        news = new Node (o);
    }
    
    public void addLast (Object o)
    {
        createNode(o);
        
        if (isEmpty())
            head=tail=news; //read from right to left
        else
        {
            tail.ptr = news;
            tail = news;
        }
    }
    
    public void addFirst (Object o)
    {
        createNode(o);
        
        if (isEmpty())
            head=tail=news;
        else
        {
            news.ptr = head;
            head = news;
        }
    }
    
    public Object getFirst()
    {
        Object o;
        
        if (isEmpty()) //no node
            return null;
        
        else //have node
        {
            o = head.obj;
            curr = head;
            return o;
        }            
    }
    
    public Object getNext() //return obj sebelah je 
    {
        Object o;
        
        if (isEmpty()) //no node
            return null;
        
        else if (curr.ptr == null) //satu node
            return null;
        
        else //more than one node
        {
            curr = curr.ptr;
            o = curr.obj;
            return o;
        }
    }
    
    public Object getLast()
    {
        Object o;
        
        if (isEmpty()) //no node
            return null;
        
        else
        {
            o = tail.obj;
            return o;
        }
    }
    
    public Object removeFirst()
    {
        Node temp; Object o;
        
        if (isEmpty()) //no node
            return null;
        
        else //ada node
        {
            o = head.obj; //store the removed object in Object o
            
            if (head == tail) //satu node
            {
                head = tail = null;
            }
            
            else //more than one node
            {
                temp = head;
                head = head.ptr;
                temp.ptr = null;
            }
            
            return o;
        }
    }
    
    public Object removeLast()
    {
        Node c = head , temp = null;
        Object o,d;
        
        if (isEmpty()) //no node
            return null;
            
        else
        {
            o = tail.obj; //store the removed object in Object o
            
            if (head == tail) //satu node
            {
                head = tail = null;
            }
            
            else 
            {
                while (c!=tail)
                {
                    d = c.obj; 
                    temp = c; //store dlm temp dulu
                    c = c.ptr; //sbb bila c smpi tail akan store value tail
                    System.out.println(d + " Value: " + c); //tracing 
                }
                tail = temp; //temp = previosnode. 
                tail.ptr = temp.ptr = null; //putuskan pointer yg node sblm tail
                System.out.println("C.obj: " + c.obj); //prove c store tail
                
                
            }
            
            return o;
        }
    }
    
    public void display()
    {        
        Node d = head; 
        Object o = null; 
        if (isEmpty()) //no node
            System.out.print("no list");
        
        else
        {
            
            while (d!=null)
            {
                o = d.obj;
                System.out.println(o);
                d = d.ptr;
            }
        }
            
    }
}

