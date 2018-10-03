/*
 * Project Q8

Write a program to simulate job scheduling in an operating system. Jobs are generated at random times. 
Each job is given both a random priority from 1 to 4—where 1 is the highest priority—and a random amount of time to complete its execution.
Jobs do not begin execution and run to completion, but instead share the processor. 
The operating system executes a job for a fixed unit of time called a time slice. 
At the end of the time slice, the current job’s execution is suspended. 
The job is then placed in a priority queue, where it waits for its next share of processor time. 
The job having the highest priority is then removed from the priority queue and executed for a time slice.
When a job is first generated, it will begin executing immediately if the processor is free. 
Otherwise it will be placed in the priority queue.

 */
package jobscheduling;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Matthew Minor
 */
public class JobScheduling {
    //store jobs in a queue and work on them for alloted time slice then if not done move to back, if done delete
    public static Queue<MakeJob> jobs = new LinkedList<>();
    
    public static void main(String[] args) {
        
        Thread startJob = new Job();
        startJob.start();
        
        Thread doJobs = new DoJobs();
        doJobs.start();
        
    }
    
}
