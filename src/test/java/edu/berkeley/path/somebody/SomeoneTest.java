package edu.berkeley.path.somebody;

import org.junit.Test;
import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by brian on 10/4/17.
 */
public class SomeoneTest {
    @org.junit.Test
    public void getTarget() {
        Someone mySomeone = new Someone();
        String myTarget = mySomeone.getTarget();
        assertTrue("Correct Target", myTarget == "brian");
    }

}