package org.springinaction.knights;

import org.junit.Test;
import static org.mockito.Mockito.*;
import org.springinaction.quests.Quest;

/**
 * Created by lkacimi on 4/6/2017.
 */
public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() throws Exception {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest,times(1)).embark();


    }

}