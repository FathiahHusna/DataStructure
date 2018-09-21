
/**
 * @author NAME: Fathiah Husna Binti Firdaus
 * @version DATE: 7th September 2018
 * ID: 2016647044
 * GROUP: CS2305A
 * TITLE: Lab Assignment 1 :: CSC508
 */
import java.util.*;
public class Lala
{
    public static void main(String args[])
    {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        task7();
        task8();
    }
    
    static final int SIZE = 10; 
    static int arr[] = new int[SIZE]; //1,2,3,4,5
    static int arr_rev[] = new int[SIZE]; //reverse order
    static int arr2[] = new int[SIZE]; //even num
    static int arr3[] = {2, 4, 2, 3, 1}; //dup elements
    static String t = "\n==TASK ";
    static String t1= "==";
    
    public static void createArray(int[] arr)
    {
        for (int i=0; i<arr.length; i++)
        {
            arr[i]= (i+1)*1;
            //list.add(a1[i]);
        }
    }
    
    public static void displayArray()
    {
        System.out.print("( ");
        for (int i=0; i<arr.length; i++)
           System.out.print(arr[i] + " ");
        System.out.print(")");
    }
    
    private static void swap(int[] arr, int j, int k)
    {
        int temp = arr[j]; //store kt temp dulu
        arr[j] = arr[k]; //pindahkan element 
        arr[k] = temp; //swap element temp ke dlm current arr
    }
    
    public static void shuffleIndex(int[] arr)
    {
        Random r = new Random();
        r.nextInt();
        
        for (int i=0; i<arr.length; i++)
        {
            int index = r.nextInt(arr.length-i);
            swap(arr, i, index);
        }
    }
    
    public static void task1()
    {        
        System.out.println(t + "1" + t1);
        createArray(arr);
        System.out.print("Original array ");
        displayArray();
        shuffleIndex(arr);
        System.out.print("\nRandom array ");
        displayArray();
    } 

    /*public static void task1ArrayList()
    {
        //ArrayList list = new ArrayList();
        //Collections.shuffle(list);
        //System.out.println(list);
        //swap(arr);
    }*/
    
    public static void arrReverse(int[] arr)
    {        
        createArray(arr);
        int temp=0;
        int j= SIZE-1;
        
        for (int i=0; i<arr_rev.length; i++)
        {
            arr_rev[i] = arr[j];
            j--;
        }
    }
    
    public static void displayArrRev()
    {
        {   
            System.out.print("Rev Array ( ");
            
            for (int i=0; i<arr_rev.length; i++)
                System.out.print(arr_rev[i] + " ");
            
            System.out.print(")");
        }
    }
    
    public static void task2()
    {        
        System.out.println(t + "2" + t1);
        createArray(arr);
        System.out.print("Original array ");
        displayArray();
        arrReverse(arr);
        System.out.print("\n");
        displayArrRev();       
    }
    
    public static void searchKey(int k)
    {
        boolean jumpa = false;
        int i=0;
        for (i=0; i<arr.length; i++)
        {
            
            if (k==arr[i])
            {
                jumpa = true;
                break;
            }
            
        }
        
        System.out.print("\nSearching for number.." + k);
        if (jumpa)
            System.out.println("\nFOUND at index " + i);
            
        else

            System.out.println("\nNOT FOUND " + k);

    }
    
    public static void task3()
    {
       System.out.println(t + "3" + t1);
       createArray(arr);
       displayArray();
       searchKey(5);
       searchKey(55);
    }
    
    public static void bubbleSort()
    {
        for (int j=0; j<arr.length; j++) //loop utk setiap elements
        {
            for (int i=0; i<arr.length-1; i++) //check smpi index 3 sahaja
            {
                if (arr[i] > arr[i+1]) //sbb compare smpi index 3>4 je
                    swap(arr, i, i+1);

                else
                    continue;
            }
        }
    }
    
    public static void task4()
    {
        System.out.println(t + "4" + t1);
        task1();
        bubbleSort();
        System.out.println("\nAfter sort by bubble sort:");
        displayArray();
    }
    
    static String str [] = {"Fathiah", "suka", "makan", "potato", "KFC"};
    
    public static void dispStr()
    {
        for (int i=0; i<str.length; i++)
            System.out.print(str[i] + ", ");
    }
    
    private static void swapStr(String[] strr, int j, int k)
    {
        String temp = str[j]; //store kt temp dulu
        str[j] = str[k]; //pindahkan element 
        str[k] = temp; //swap element temp ke dlm current arr
    }
    
    public static void sortStr()    
    {
        for (int j=0; j<str.length; j++)
        {
            for (int i=0; i<str.length-1; i++)
            {
                int result = str[i].compareTo(str[i+1]);
                
                if (result > 0)
                    swapStr(str, i, i+1);
                
                else
                    continue;
            }
        }
    }
    
    public static void task5()
    {
        System.out.println(t + "5" + t1);
        System.out.println("UNSORTED:");
        dispStr();
        sortStr();
        System.out.println("\nSORTED (asc order):");
        dispStr();
    }
       
    public static void createArray2(int[] arr2)
    {
        for (int i=0; i<arr2.length; i++)
        {
            arr2[i]= (i+1)*2;            
        }
    }
    
    public static void dispArr2()
    {
        System.out.print("( ");
        for (int i=0; i<arr2.length; i++)
            System.out.print(arr2[i] + " ");
        System.out.print(")");
    }
    
    public static void compArr(int[] arr)
    {
        boolean match = false;
        System.out.println("Comparing..");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i] + " " + arr2[i]);
            
            if (arr[i] != arr2[i])
            {
                match = true;
            }            
        }
        
        if (match)
            System.out.println("Array is NOT THE SAME");
            
        else
            System.out.println("Array is THE SAME");
    }
    
    public static void task6()
    {
        System.out.println(t + "6" + t1);
        createArray2(arr2);
        createArray(arr);
        System.out.print("Array 1 ");
        dispArr2();
        System.out.println( );
        System.out.print("Array 2 ");
        dispArr2();
        System.out.println();
        compArr(arr2);
        System.out.print("\nArray 1 ");
        displayArray();
        System.out.println( );
        System.out.print("Array 2 ");
        dispArr2();
        System.out.println();
        compArr(arr);
    }
    
    static String ayat[] = { "apple is red", "banana is yellow", "carrot is orange"};
    static String f = "my name is fathiah";
    
    public static void upperFirst(String[] ayat)
    {
        
        for (int i=0; i<ayat.length; i++)
        {
             ayat[i] = ayat[i].substring(0,1).toUpperCase() + ayat[i].substring(1);
        }
    }
    
    public static void upperFirstAll(String[] ayat)
    {
        for (int i=0; i<ayat.length; i++)
        {
            upperTest(ayat[i]);            
        }
    
    }
    
    public static void upperTest(String f)
    {
        Scanner scan = new Scanner (f);
        String r = " ";
        
        while (scan.hasNext())
        {
            String baca = scan.next();
            r = r +  Character.toUpperCase(baca.charAt(0)) + baca.substring(1) + " ";
        }
        
        System.out.println(r.trim());
    }
    
    public static void printTest()
    {
        System.out.println(f);
    }
    
    public static void printAyat()
    {
        for (int i=0; i<ayat.length; i++)
            System.out.println(ayat[i]);
    }
    
    public static void task7()
    {
        System.out.println(t + "7" + t1);
        System.out.println("ALL IN SMALL: ");
        printAyat();
        System.out.println("ALL FIRST IN CAPITAL: ");
        upperFirstAll(ayat);
    }
    
    public static void checkDup(int[] arr3)
    {
        boolean duplicate = false; 
        
        for (int j=0; j<arr3.length; j++)
        {
            for (int i=j+1; i<arr3.length; i++)
            {
                if (j!=i && arr3[j] == arr3[i])
                    duplicate = true;             
            }            
        }
        
        if (duplicate)
            System.out.println("\nNOT UNIQUE. has DUPLICATE elements");
        
            
        else
            System.out.println("\nUNIQUE. has VARIETY elements");
    }
    
    public static void printArr3()
    {
        System.out.print("( ");
        for (int i=0; i<arr3.length; i++)
            System.out.print(arr3[i] + " ");
        System.out.print(" )");
    }
    
    public static void task8()
    {
        System.out.println(t + "8" + t1);
        printArr3();
        checkDup(arr3);
        createArray(arr);
        displayArray();
        checkDup(arr);
    }
}

