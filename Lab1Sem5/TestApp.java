
/**
 * @author NAME: Fathiah Husna Binti Firdaus
 * @version DATE: 14th September 2018
 * ID: 2016647044
 * GROUP: CS2305A
 * TITLE: Lab Exercise 1 :: CSC508
 */
public class TestApp
{
    static final int SIZE = 5;
    static MyArrayList arr = new MyArrayList(SIZE);
    
    //call getData() and display all the data in arr
    public /*static*/ void get()
    {
        for(int j=0; j<SIZE; j++)
            System.out.println("arr[" + j+ "] " + arr.getData(j)); 

    }
        
    public static void main (String args[])
    {
        int i;
        TestApp t = new TestApp();
        
        System.out.println("Test " + arr);

        for(i=1; i<=SIZE; i++)
        {
            arr.addFirst((i*2));
        }
        System.out.println("AddFirst " + arr);
        
        t.get();
        
        arr.clear();
        System.out.println("After clear " + arr);
        
        for(i=1; i<=SIZE; i++)
        {
            arr.addLast((i*2));
        }
        System.out.println("AddLast " + arr);
        
        t.get();
        
        arr.setData(4,55);
        System.out.println("SetData arr[4] " + arr);
        
        System.out.println("Remove arr[1]= " + arr.removeData(1));
        System.out.println("Current " + arr);
        arr.addLast(70);
        System.out.println("LATEST, AddLast " + arr);
        
        t.get();
 
        System.out.println();
        
        System.out.println("getFirst= " + arr.getFirst());
        System.out.println("getLast= " + arr.getLast());
        System.out.println("removeFirst= " + arr.removeFirst());
        System.out.println("After removeFirst " + arr);
        System.out.println("removeLast= " + arr.removeLast());
        System.out.println("After removeLast " + arr);
    }
}
