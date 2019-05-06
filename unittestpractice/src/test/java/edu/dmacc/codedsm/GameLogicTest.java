package edu.dmacc.codedsm;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameLogicTest {
    private GameLogic testGameLogic;
    public GameRunnerImpl runner;
    @Before
    public void setUp() throws Exception {

        this.testGameLogic = new GameLogic(runner);
    }

    @Test
    public void runGame() {
        GameResult resultTest = new GameResult();
        testGameLogic = new GameLogic(new GameRunnerImpl());
        resultTest.setPlayer("james");
        resultTest.setScore(500);
        assertEquals(resultTest.getPlayer(), testGameLogic.runGame("james").getPlayer());
    }

    @Test
    public void buildResult() {
        GameResult resultTest = new GameResult();
        testGameLogic = new GameLogic(new GameRunnerImpl());
        resultTest.setPlayer("james");
        resultTest.setScore(500);
        assertEquals(resultTest.getScore(), testGameLogic.buildResult("james",500).getScore());
    }
}