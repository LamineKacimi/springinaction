package org.springinaction.quests;

import org.springframework.stereotype.Component;

/**
 * Created by lkacimi on 4/6/2017.
 */
@Component
public class RescueDamselQuest implements Quest {
    public void embark() {
        System.out.println("Embarking on a RescueDamsetQuest");
    }
}
