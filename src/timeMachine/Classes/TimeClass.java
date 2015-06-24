package timeMachine.Classes;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shahar
 */
public class TimeClass {
    public Date start;
    public Date end;
    
    public void startNow()
    {
        start=new Date();
    }
    public void endNow()
    {
        end=new Date();
    }
    public boolean isStarted()
    {
        return start!=null;
    }
    public boolean isEnded()
    {
        return end!=null;
    }
    public boolean isDone()
    {
        return this.isStarted() && this.isEnded();
    }
    public double getTotalTime()
    {
        return (double)Math.round(100*(((double)end.getTime()-start.getTime())/((double)(1000*60*60))))/(double)100;
    }
    
    
}
