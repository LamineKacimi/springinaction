package org.springinaction.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springinaction.knights.BraveKnight;
import org.springinaction.knights.Knight;
import org.springinaction.quests.Quest;
import org.springinaction.quests.SlayDragonQuest;

/**
 * Created by lkacimi on 4/6/2017.
 */
@Configuration
public class KnightConfig {
    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }
}
