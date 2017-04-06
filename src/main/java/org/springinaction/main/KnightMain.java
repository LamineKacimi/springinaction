package org.springinaction.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springinaction.config.KnightConfig;
import org.springinaction.knights.Knight;

/**
 * Created by lkacimi on 4/6/2017.
 */

public class KnightMain {
    public static void main(String[] args) throws Exception {
        //ClassPathXmlApplicationContext
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("knight.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
