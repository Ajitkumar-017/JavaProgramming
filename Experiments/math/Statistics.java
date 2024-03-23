package math;

public class Statistics {
    public void mean(int [] arr,int n) 
	{
        int sum = 0;
        for (int i = 0; i < n; i++) 
            sum += arr[i];
        float result = sum / n;
        System.out.println("Mean: " + result);
    }

    public void median(int[] arr,int n) 
	{
        float median = 0;
        if (n % 2 != 0) 
		{
            median = arr[n / 2];
            System.out.println("Median: " + median);
        } 
		else 
		{
            median = (arr[n / 2 ] + arr[(n / 2)+1]) / 2;
            System.out.println("Median: " + median);
        }
    }

    public void avg(int [] arr,int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) 
            sum += arr[i];
        float result = sum / n;
        System.out.println("Average: " + result);
    }

    public void stddev(int [] arr,int n) {
        int sum = 0;
        double variance = 0.0;
    
        for (int i = 0; i < n; i++) 
            sum += arr[i];
        float mean = sum / n;
        for (int i = 0; i < n; i++) 
            variance += Math.pow(arr[i] - mean, 2);
        variance /= n;
        System.out.printf("Variance: %.4f\n",variance);
        double result = Math.sqrt(variance);
        System.out.printf("Standard deviation: %.4f\n",result);
    }
}
