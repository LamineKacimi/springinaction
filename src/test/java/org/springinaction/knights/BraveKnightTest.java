package org.springinaction.knights;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.*;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springinaction.quests.Quest;

/**
 * Created by lkacimi on 4/6/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = org.springinaction.config.KnightConfig.class)
public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() throws Exception {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest,times(1)).embark();


    }

    @Test
    public void dummyTest(){
        Assert.assertEquals("Equal",2,1);
    }

}