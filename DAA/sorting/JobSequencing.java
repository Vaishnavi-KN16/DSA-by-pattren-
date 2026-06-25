
class Job {
    int id, deadline, profit;

    Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobSequencing {

    public static void main(String[] args) {

        Job[] jobs = {
            new Job(1, 2, 100),
            new Job(2, 1, 19),
            new Job(3, 2, 27),
            new Job(4, 1, 25),
            new Job(5, 3, 15)
        };

        // Sort by profit (descending)
        for (int i = 0; i < jobs.length - 1; i++) {
            for (int j = i + 1; j < jobs.length; j++) {

                if (jobs[i].profit < jobs[j].profit) {

                    Job temp = jobs[i];
                    jobs[i] = jobs[j];
                    jobs[j] = temp;
                }
            }
        }

        boolean[] slot = new boolean[4];
        int profit = 0;

        System.out.print("Selected Jobs: ");

        for (int i = 0; i < jobs.length; i++) {

            for (int j = jobs[i].deadline; j > 0; j--) {

                if (!slot[j]) {

                    slot[j] = true;
                    profit += jobs[i].profit;

                    System.out.print("J" + jobs[i].id + " ");

                    break;
                }
            }
        }

        System.out.println("\nTotal Profit = " + profit);
    }
}