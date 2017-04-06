package org.springinaction.knights;

import org.springinaction.quests.Quest;
import org.springinaction.quests.RescueDamselQuest;

/**
 * Created by lkacimi on 4/6/2017.
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }
    public void embarkOnQuest() {
        quest.embark();
    }
}
