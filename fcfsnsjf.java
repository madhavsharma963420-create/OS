public class fcfsnsjf {

    public static void main(String[] args) {
        String p[] = {"P1", "P2", "P3", "P4"};
        int bt[] = {5, 2, 3, 4};

        fcfs(p.clone(), bt.clone());
        sjf(p.clone(), bt.clone());
    }

    // FCFS
    static void fcfs(String p[], int bt[]) {
        int n = p.length;
        int wt[] = new int[n];
        int tat[] = new int[n];

        wt[0] = 0;

        for (int i = 1; i < n; i++) {
            wt[i] = wt[i - 1] + bt[i - 1];
        }

        for (int i = 0; i < n; i++) {
            tat[i] = wt[i] + bt[i];
        }

        System.out.println("\nFCFS:");
        for (int i = 0; i < n; i++) {
            System.out.println(p[i] + " BT=" + bt[i] +
                               " WT=" + wt[i] +
                               " TAT=" + tat[i]);
        }
    }

    // SJF
    static void sjf(String p[], int bt[]) {
        int n = p.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (bt[i] > bt[j]) {

                    int temp = bt[i];
                    bt[i] = bt[j];
                    bt[j] = temp;

                    String t = p[i];
                    p[i] = p[j];
                    p[j] = t;
                }
            }
        }

        int wt[] = new int[n];
        int tat[] = new int[n];

        wt[0] = 0;

        for (int i = 1; i < n; i++) {
            wt[i] = wt[i - 1] + bt[i - 1];
        }

        for (int i = 0; i < n; i++) {
            tat[i] = wt[i] + bt[i];
        }

        System.out.println("\nSJF:");
        for (int i = 0; i < n; i++) {
            System.out.println(p[i] + " BT=" + bt[i] +
                               " WT=" + wt[i] +
                               " TAT=" + tat[i]);
        }
    }
}