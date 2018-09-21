
/**
 * @author NAME: Fathiah Husna Binti Firdaus
 * @version DATE: 21st September 2018
 * ID: 2016647044
 * GROUP: CS2305A
 * TITLE: Lab Exercise 2 :: CSC508
 */
public class TestApp2
{
    static MyLinkedList link = new MyLinkedList();
    static int SIZE = 5; 
    
    //removeFirst
    public void removeprint1()
    {
        System.out.println("RemoveFirst: " + link.removeFirst());
        System.out.println("After remove first");     
    }
    
    //removeLast
    public void removeprint2()
    {
        System.out.println("RemoveLast: " + link.removeLast());
        System.out.println("After remove last");       
    }
    
    //print all get method
    public void printGet()
    {
        System.out.println("Getfirst: " + link.getFirst());
        System.out.println("GetNext: "  + link.getNext());
        System.out.println("GetLast: " + link.getLast());
    }
    
    public static void main (String[] args)
    {
        TestApp2 f = new TestApp2();
        
        for (int i=0; i<SIZE; i++)
        {
            link.addFirst((i+1)*2);
        }
        
        //link.addFirst(1);
        //link.addFirst(2);
        //link.addFirst(3);
        
        link.display();
        f.printGet();       
        f.removeprint2();
        link.display();
        f.removeprint1();
        link.display();
        f.printGet();
        
        

    }
}
