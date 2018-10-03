
package jobscheduling;

/**
 *
 * @author Matthew Minor
 */
public class DoJobs extends Thread{
    
    @Override
    public void run(){
        final int timeSlice = 10;
        int timeLeft = 0;
        
        for(int i = 0; i < 100; i++){
            
            
            
            if(JobScheduling.jobs.isEmpty()){
                //do nothing
                System.out.println("Queue is empty here.");
            }            
            else{
                System.out.println("\tStarted working a Job");
                //do jobs for certain time slice
                MakeJob job = new MakeJob(JobScheduling.jobs.peek().getPriority(), JobScheduling.jobs.peek().getTime());
                
                //do the math here for time slice and time 2 complete
                JobScheduling.jobs.remove();
                timeLeft = job.getTime() - timeSlice;
                
                //check if time left is less than or equal to zero
                if(timeLeft > 0){
                    job.setTime(timeLeft);
                    JobScheduling.jobs.add(job);
                    System.out.println("\tStopped working on Job, if time was higher than timeSlice (10), then it should be back in the queue.");
                }
                else{
                    System.out.println("\tFinished Job");
                }
                

            }
            try{
                Thread.sleep(5000);
            }
            catch(InterruptedException e){
                
            }
            
        }
        
    }
    
}
