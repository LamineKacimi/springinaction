package org.springinaction.minstrel;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.io.PrintStream;

/**
 * Created by lkacimi on 4/6/2017.
 */
@Aspect
@Component
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    @Before("execution(* *.embarkOnQuest(..))")
    public void singBeforeQuest(){
        this.stream.println("Fa la la, the knight is so brave!");
    }

    @After("execution(* *.embarkOnQuest(..))")
    public void singAfterQuest(){
        this.stream.println("The knight did embark on a quest");
    }

}
