package org.springinaction.quests;

import java.io.PrintStream;

/**
 * Created by lkacimi on 4/6/2017.
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        this.stream.println("Embarking on quest to slay the dragon!");
    }
}
