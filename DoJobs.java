
package jobscheduling;

/**
 *
 * @author Matthew Minor
 */
public class DoJobs extends Thread{
    
    @Override
    public void run(){
        final int timeSlice = 15;
        
        for(int i = 0; i < 100; i++){
            
            if(JobScheduling.jobs.isEmpty()){
                //do nothing
            }            
            else{
                //do jobs for certain time slice
                //MakeJob job = new MakeJob(JobScheduling.jobs.peek().getTime(), JobScheduling.jobs.peek().getPriority());
                //do the math here for time slice and time 2 complete
                JobScheduling.jobs.peek().setTime(JobScheduling.jobs.peek().getTime() - timeSlice);
            }
        }
        
    }
    
}
