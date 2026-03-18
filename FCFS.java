public class FCFS {
    public static void main(String[] args) {

        int n = 5;
        int bt[] = {5, 2, 4, 3, 2};  // Burst Time
        int wt[] = new int[n];       // Waiting Time
        int tat[] = new int[n];      // Turnaround Time

        // Waiting time for first process = 0
        wt[0] = 0;

        // Calculate Waiting Time
        for(int i = 1; i < n; i++) {
            wt[i] = wt[i-1] + bt[i-1];
        }

        // Calculate Turnaround Time
        for(int i = 0; i < n; i++) {
            tat[i] = wt[i] + bt[i];
        }

        // Print results
        System.out.println("Process\tBT\tWT\tTAT");

        int totalWT = 0, totalTAT = 0;

        for(int i = 0; i < n; i++) {
            System.out.println("P" + (i+1) + "   \t" + bt[i] + "  \t" + wt[i] + "\t" + tat[i]);
            totalWT += wt[i];
            totalTAT += tat[i];
        }bbb

        // Averages
        double avgWT = (double) totalWT / n;
        double avgTAT = (double) totalTAT / n;

        System.out.println("\nAverage Waiting Time = " + avgWT);
        System.out.println("Average Turnaround Time = " + avgTAT);
    }
}