import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SquadTest {

    @Test
    @DisplayName("Name getter")
    void getName() {
        Squad avengers = new Squad("Avengers",7,"starlabs");
        assertEquals("Avengers", avengers.getName());
    }

    @Test
    @DisplayName("Name setter")
    void setName() {

    }

    @Test
    @DisplayName("Size getter")
    void getSize() {
    }

    @Test
    @DisplayName("Size setter")
    void setSize() {
    }

    @Test
    @DisplayName("Cause getter")
    void getCause() {
    }

    @Test
    @DisplayName("Cause setter")
    void setCause() {
    }

    @Test
    @DisplayName("Id getter")
    void getId() {
    }

    @Test
    @DisplayName("Id setter")
    void setId() {
    }

    @Test
    @DisplayName("get appearance")
    void getAppearance() {
    }

    @Test
    @DisplayName("set appearance ")
    void setAppearance() {
    }

    @Test
    @DisplayName("Get a specific hero")
    void getHeroes() {

    }

    @Test
    void setHeroes() {
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
        assertFalse(testSquad.getHeroes().contains(superman));
    }

    @Test
    void removeHero() {
    }

    @Test
    void removeHeroes() {
    }

    @Test
    void clearSquads() {
    }

    @Test
    @DisplayName("Gets a Hero")
    void find_returnsCorrectHeroFromAList_Hero() {
        Squad bigHero6 = new Squad("BigHero6",6,"Science");
        Squad smash = new Squad("SMASH", 6,"Harmony");
        assertEquals(smash,Squad.find(2));
    }

    @Test
    @DisplayName("Get all squads in a list")
    void getSquads() {
    }
}