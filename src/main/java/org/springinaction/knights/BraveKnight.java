package org.springinaction.knights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springinaction.quests.Quest;
import org.springinaction.quests.RescueDamselQuest;

/**
 * Created by lkacimi on 4/6/2017.
 */
@Component
public class BraveKnight implements Knight {
    @Autowired
    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }
    public void embarkOnQuest() {
        quest.embark();
    }
}
