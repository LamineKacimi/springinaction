package org.springinaction.quests;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.io.PrintStream;

/**
 * Created by lkacimi on 4/6/2017.
 */
@Component
@Primary
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public SlayDragonQuest() {
        this.stream = System.out;
    }

    public void embark() {
        this.stream.println("Embarking on quest to slay the dragon!");
    }
}
