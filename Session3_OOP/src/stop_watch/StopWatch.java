package stop_watch;

import java.util.Date;

public class StopWatch {
    double startTime;
    double endTime;

    public StopWatch(double startTime, double endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void stat(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime(){
        return endTime - startTime;
    }


}
