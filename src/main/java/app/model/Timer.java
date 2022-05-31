package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("timerBean")
public class Timer {

    private Long nanoTime = System.nanoTime();

    @Autowired
    public Long getTime() {
        return nanoTime;
    }
}
