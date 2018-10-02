
package jobscheduling;

/**
 *
 * @author Matthew Minor
 */
public class MakeJob {
    //instance fields
    public int priority;
    public int time2Complete;


    //constructor
    MakeJob(int p, int t){
        this.priority = p;
        this.time2Complete = t;
    }
    
    //methods
    public int getPriority(){
        return priority;
    }
    public int getTime(){
        return time2Complete;
    }
    
    @Override
    public String toString(){
        String r = "Priority = " + priority + "\tTime to Complete =  " + time2Complete;
        return r;
    }
    
}
