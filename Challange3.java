package SlassCom;

/**
 * Challange3
 */
public class Challange3 
{
    public static void main(String[] args) 
    {
        int arr[] = {47, 84, 75, 21, 14, 14, 79};
        bubbleSortOptiExp(arr);
        findMedian(arr);
        findHighestVal(arr);
        findMean(arr);
        findPrimeNum(arr);
        
    }


    public static int[] bubbleSortOptiExp(int arry[])
    {
        int pass = 0;
        boolean sorted;
        do
        {
            sorted = true;
            for(int ii = 0; ii < arry.length - pass - 1;ii++)
            {
                if(arry[ii] > arry[ii+1])
                {
                    int temp = arry[ii];
                    arry[ii] = arry[ii+1];
                    arry[ii+1] = temp;
                    sorted = false;

                }

            }

            pass = pass+ 1;

        }while(sorted == false);
        
        return arry;
    }

    public static void findMedian(int sortedArr[]) 
    {
        if(sortedArr.length % 2 != 0)
        {
            System.out.println("The median of the data set is : " + sortedArr[sortedArr.length / 2]);
        }
        else
        {
            System.out.println("The median of the data set is : " + (sortedArr[sortedArr.length / 2] + sortedArr[sortedArr.length / 2-1])/2.0);
        }
        
        
    }

    public static void findMean(int sortedArr[]) 
    {
        int maxNumber = -1;
        int maxAppearance = -1;
        
        

        for(int i = 0; i < sortedArr.length; i++)
        {
            int count = 0;
            
            for(int j = 0; j < sortedArr.length; j++)
            {
                if(sortedArr[i] == sortedArr[j])
                {
                    count++;
                }
            }

            if(count > maxAppearance)
                {
                    maxNumber = sortedArr[i];
                    maxAppearance = count;
                }

        }
        
        System.out.println("The mode of the data set is : " + maxNumber + "\n");
    }

   
    public static void findHighestVal(int sortedArr[]) 
    {
        int large = sortedArr[0];

        for(int i = 0; i < sortedArr.length; i++)
        { 
            if(large < sortedArr[i])
            {
                large = sortedArr[i];
            }
        }

        System.out.println("The highest value is: " + large);
    }


    public static void findPrimeNum(int sortedArr []) 
    {
       
        int flag = 0;

        for (int cnt = 0; cnt < sortedArr.length; cnt++) {
        flag = 0;
        for (int i = 2; i < sortedArr[cnt] / 2; i++) {
            if (sortedArr[cnt] % i == 0) {
            flag = 1;
            break;
            }
        }
            System.out.printf("%3d - %s\n", sortedArr[cnt], (flag == 0 ? "Prime" : "Not Prime"));
        }
        System.out.println();
      
    }
}


