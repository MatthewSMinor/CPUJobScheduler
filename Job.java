
package jobscheduling;

import java.util.Random;

/**
 *
 * @author Matthew Minor
 */
public class Job extends Thread{
    
    @Override
    public void run(){
        int priority;
        int time2Complete;
        
        
        //thread runs 10 times
        for(int i = 0; i < 10; i++){
            Random r = new Random();
            priority = r.nextInt((4-1)+1)+1;
            Random n = new Random();
            time2Complete = n.nextInt((20-1)+1)+1;
            
            MakeJob job = new MakeJob(priority, time2Complete);
            
            System.out.println("\n\tpriority = "+job.getPriority());
            System.out.println("\ttime = " + job.getTime() + "\n");

            //return the job to be added to main job queue
            JobScheduling.jobs.add(job);
            
            //test printing the queue
            System.out.println(JobScheduling.jobs.toString());
            
            //thread waits 5 seconds to make a new job
            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
            
            }
            
        }
        
        

        
    }
    
}
