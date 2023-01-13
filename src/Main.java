import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
//ZADANIE 1
/*public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Wpisz liczbę całkowitą:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] tab1 = new int[n];
        zad1(tab1);
        int[] tab2 = addInt(tab1,2);
        System.out.println();
        zad1(tab2);
    }
    static void zad1(int[] arr)
    {
        int los = 101;
        Random m = new Random();
        //arr = new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = m.nextInt(los);
            System.out.println(arr[i]);
        }
    }
    static int[] addInt(int[] arr, int n)
    {
        int[] tmp = Arrays.copyOf(arr,arr.length);
        for(int i = 0; i < tmp.length; i++)
        {
            tmp[i] += n;
        }
        return tmp;
    }
}*/
//ZADANIE 2
/*public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Wpisz liczbę całkowitą:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] tab1 = new int[n];
        zad1(tab1);
        System.out.println();
        sortowanie(tab1);
        System.out.println();
    }
    static void zad1(int[] arr)
    {
        int los = 101;
        Random m = new Random();
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = m.nextInt(los);
            System.out.println(arr[i]);
        }
    }
    static void sortowanie(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tmp = 0;
                if (arr[i] > arr[j])
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}*/
//ZADANIE 3
/*public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Wpisz liczbę całkowitą:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] tab1 = new int[n];
        zad1(tab1);
        System.out.println();
        odwrotność(tab1);
    }
    static void zad1(int[] arr)
    {
        int los = 101;
        Random m = new Random();
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = m.nextInt(los);
        }
    }
    static void odwrotność(int[] arr)
    {
        for (int i = 0; i < arr.length / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }
}*/
//ZADANIE 4
/*public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Wpisz liczbę całkowitą:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] tab1 = new int[n];
        int[] tab2 = new int[n];
        losowanie(tab1);
        System.out.println();
        losowanie(tab2);
        System.out.println();
        if (czyOdwrotna(tab1,tab2))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
    static void losowanie(int[] arr)
    {
        int los = 101;
        Random m = new Random();
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = m.nextInt(los);
            System.out.println(arr[i]);
        }
    }
    static boolean czyOdwrotna(int arr[], int arr2[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] != arr2[arr2.length - 1 - i])
            {
                return false;
            }
        }
        return true;
    }
}*/

