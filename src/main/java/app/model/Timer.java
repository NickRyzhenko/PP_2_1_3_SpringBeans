package app.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Timer {
    private Timer timer;
    public Timer getTimer(){
        return timer;
    }

    private final Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}
