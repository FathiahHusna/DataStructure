
/**
 * @author NAME: Fathiah Husna Binti Firdaus
 * @version DATE: 14th September 2018
 * ID: 2016647044
 * GROUP: CS2305A
 * TITLE: Lab Exercise 1 :: CSC508
 */
public class MyArrayList
{ 
    private Object[] data;
    private int num, size;
    
    public MyArrayList (int k)
    {
        size = k;
        data = new Object[size];
        num = 0;
    }
    
    public int num()
    {
        return num;
    }
    
    public int size()
    {
        return size;
    }
      
    public Object getData (int i)
    {
        if (isEmpty())
            throw new ArrayListException("It is empty");
        
        else if((i<0) || (i>num))
            throw new ArrayListException ("Index is out of bounds");
        return data[i];
    }
    
    public Object getFirst ()
    {
        if (isEmpty())
            throw new ArrayListException("It is empty");
        
        else
            return data[0];
            
        //or can do 
        //return getData(0);
    }
    
    public Object getLast()
    {
        return getData(num-1);
    }
    
    public void setData(int i, Object k)
    {
        if (isEmpty())
            throw new ArrayListException("It is empty");
        else if ((i<0) || (i>num))
            throw new ArrayListException("Index is out of bounds");
        data[i] = k;
    }
    
    public Object removeData (int i)
    {      
        if (isEmpty())
            throw new ArrayListException("It is empty");
        else if ((i<0) || (i>num))
            throw new ArrayListException("Index is out of bounds");
        else
        {         
            Object removeObj = data[i];
            for (int j=i; j<num-1; j++)
            {
                data[j]= data[j+1];   
            }
            num--;
            return removeObj;
        }        
    }
    
    public Object removeFirst()
    {
        return removeData(0);
    }
    
    public Object removeLast()
    {
        return removeData(num-1);
    }
    
    public void clear()
    {
        num=0;
    }
    
    public boolean isFull()
    {
        return num==size;
    }
    
    public boolean isEmpty()
    {
        return num==0;
    }
    
    public String toString()
    {
        String str = "(";
        
        if (isEmpty())
            return "( )";
        
        else 
        {
            for(int i=0; i<num; i++)
               str += data[i] + ",";
                    
               return str + ")";
        }
        
    }
      
    public void addLast (Object k)
    {
        if(!isFull())
            add(num, k); 
        //another alternative
        /*{
            data[num] = k;
            num++;
        }*/
        
        
        else
            throw new ArrayListException ("The Array List is full");
    }
    
    public void addFirst (Object k)
    {
        add(0,k);
    }
    
    private void add (int i, Object k)
    {
        if (isFull())
            throw new ArrayListException ("The Array List is full");
        else if ((i<0) || (i>num))
            throw new ArrayListException ("Index is out of bounds");
        else
        {
            for (int j=num-1; j>=i; j--)
                data[j+1] = data[j];
            data[i] = k;
            num++;
        }
    }
}
