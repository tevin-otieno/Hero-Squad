import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SquadTest {

    @AfterEach
    public void tearDown() {
        Hero.clearAll();
    }

    @Test
    @DisplayName("Name getter")
    void getName() {
        Squad avengers = new Squad("Avengers",7,"starlabs");
        assertEquals("Avengers", avengers.getName());
    }

    @Test
    @DisplayName("Name setter")
    void setName() {
        Squad avengers = new Squad("",7,"starlabs");
        avengers.setName("Avengers");
        assertEquals("Avengers", avengers.getName());

    }

    @Test
    @DisplayName("Size getter")
    void getSize() {
        Squad avengers = new Squad("Avengers",7,"starlabs");
        assertEquals(7, avengers.getSize());
    }

    @Test
    @DisplayName("Size setter")
    void setSize() {
        Squad avengers = new Squad("Avengers",0,"starlabs");
        avengers.setSize(7);
        assertEquals(7, avengers.getSize());
    }

    @Test
    @DisplayName("Cause getter")
    void getCause() {
        Squad avengers = new Squad("Avengers",7,"starlabs");
        assertEquals("starlabs", avengers.getCause());
    }

    @Test
    @DisplayName("Cause setter")
    void setCause() {
        Squad avengers = new Squad("Avengers",7,"");
        avengers.setCause("starlabs");
        assertEquals("starlabs", avengers.getCause());
    }

    @Test
    @DisplayName("add hero to Squad")
    void addHero() {
        Squad testSquad = new Squad("Justice League", 8,"World Justice");
        Hero batman = new Hero("Batman","Rich","joker and martha",testSquad.getId());
        Hero wonderwoman = new Hero("Wonderwoman","amazonian","aeries", testSquad.getId()) ;
        Hero superman = new Hero("Superman","flight,strength,laser", "kryptonite",
                testSquad.getId());
        List<Hero> expectedOutput = new ArrayList<Hero>();
        expectedOutput.add(batman);
        expectedOutput.add(wonderwoman);
        expectedOutput.add(superman);
        assertTrue(testSquad.getHeroes().contains(batman));
    }

//    @Test
//    @DisplayName("Gets a Hero")
//    void find_returnsCorrectHeroFromAList_Hero() {
//        Squad bigHero6 = new Squad("BigHero6",6,"Science");
//        Squad smash = new Squad("SMASH", 6,"Harmony");
//        assertEquals(smash,Squad.find(1));
//    }

}