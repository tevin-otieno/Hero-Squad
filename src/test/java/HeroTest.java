import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

//    @BeforeAll
//    public static void init(){
//        Squad testSquad = new Squad("Justice League", 8,"World Justice");
//        Hero batman = new Hero("Batman","Rich","joker and martha",testSquad.getId());
//        Hero wonderwoman = new Hero("Wonderwoman","amazonian","aeries", testSquad.getId()) ;
//        Hero superman = new Hero("Superman","flight,strength,laser", "kryptonite",
//                testSquad.getId());
//        List<Hero> expectedOutput = new ArrayList<Hero>();
//        expectedOutput.add(batman);
//        expectedOutput.add(wonderwoman);
//        expectedOutput.add(superman);
//
//    }
    @AfterEach
    public void tearDown() {
        Hero.clearAll();
    }

    @Test
    @DisplayName("id getter")
    void getId_returnsNumberInArray_1() {
        Squad testSquad = new Squad("Justice League", 8,"World Justice");
        List<Hero> expectedOutput = new ArrayList<Hero>();
        Hero wonderwoman = new Hero("Wonderwoman","amazonian","aeries", testSquad.getId()) ;
        expectedOutput.add(wonderwoman);
        assertEquals(1,wonderwoman.getId());
    }

    @Test
    @DisplayName("squad getter")
    void getSquadId_returnsSquadId_1() {
        Squad testSquad = new Squad("Justice League", 8,"World Justice");
        List<Hero> expectedOutput = new ArrayList<Hero>();
        Hero wonderwoman = new Hero("Wonderwoman","amazonian","aeries", testSquad.getId()) ;
        expectedOutput.add(wonderwoman);
        assertEquals(testSquad.getId(),wonderwoman.getSquadId());
    }

    @Test
    @DisplayName("instance getter")
    void Hero_instantiatedCorrectly_true() {
        Squad testSquad = new Squad("Justice League", 8,"World Justice");
        List<Hero> expectedOutput = new ArrayList<Hero>();
        Hero wonderwoman = new Hero("Wonderwoman","amazonian","aeries", testSquad.getId()) ;
        expectedOutput.add(wonderwoman);
        assertTrue(wonderwoman instanceof Hero);
    }

    @Test
    @DisplayName("Name getter")
    void getName() {
        Squad testSquad = new Squad("Justice League", 8,"World Justice");
        List<Hero> expectedOutput = new ArrayList<Hero>();
        Hero wonderwoman = new Hero("Wonderwoman","amazonian","aeries", testSquad.getId());
        expectedOutput.add(wonderwoman);
        assertEquals("Wonderwoman",wonderwoman.getName());
    }

    @Test
    @DisplayName("name setter")
    void setName() {
        Squad testSquad = new Squad("Justice League", 8,"World Justice");
        List<Hero> expectedOutput = new ArrayList<Hero>();
        Hero wonderwoman = new Hero("","amazonian","aeries", testSquad.getId());
        wonderwoman.setName("wonderwoman");
        assertEquals("wonderwoman",wonderwoman.getName());
    }

    @Test
    @DisplayName("power getter")
    void getPower() {
        Squad testSquad = new Squad("Justice League", 8,"World Justice");
        List<Hero> expectedOutput = new ArrayList<Hero>();
        Hero wonderwoman = new Hero("Wonderwoman","amazonian","aeries", testSquad.getId()) ;
        expectedOutput.add(wonderwoman);
        assertEquals("amazonian",wonderwoman.getPower());
    }

    @Test
    @DisplayName("power setter")
    void setPower() {
    }

    @Test
    @DisplayName("weakness getter")
    void getWeakness() {
        Squad testSquad = new Squad("Justice League", 8,"World Justice");
        List<Hero> expectedOutput = new ArrayList<Hero>();
        Hero wonderwoman = new Hero("Wonderwoman","amazonian","aeries", testSquad.getId()) ;
        expectedOutput.add(wonderwoman);
        assertEquals("aeries",wonderwoman.getWeakness());
    }

    @Test
    @DisplayName("weakness setter")
    void setWeakness() {
        Squad testSquad = new Squad("Justice League", 8,"World Justice");
        List<Hero> expectedOutput = new ArrayList<Hero>();
        Hero wonderwoman = new Hero("Wonderwoman","amazonian","", testSquad.getId()) ;
        expectedOutput.add(wonderwoman);
        wonderwoman.setWeakness("aeries");
        assertEquals("aeries",wonderwoman.getWeakness());
    }

    @Test
    @DisplayName("finds a hero")
    void findHero_ReturnsAnInstanceOfHeroes_Hero() {
        Squad testSquad = new Squad("Justice League", 8,"World Justice");
        List<Hero> expectedOutput = new ArrayList<Hero>();
        Hero wonderwoman = new Hero("Wonderwoman","amazonian","aeries", testSquad.getId()) ;
        expectedOutput.add(wonderwoman);
        assertEquals(wonderwoman,Hero.findHero(1));
    }


    @Test
    @DisplayName("gets the list of heroes")
    void getHeroes_returnsList_List() {
        Squad testSquad = new Squad("Justice League", 8,"World Justice");
        Hero batman = new Hero("Batman","Rich","joker and martha",testSquad.getId());
        Hero wonderwoman = new Hero("Wonderwoman","amazonian","aeries", testSquad.getId()) ;
        Hero superman = new Hero("Superman","flight,strength,laser", "kryptonite",
               testSquad.getId());
        List<Hero> expectedOutput = new ArrayList<Hero>();
        expectedOutput.add(batman);
        expectedOutput.add(wonderwoman);
        expectedOutput.add(superman);
        assertEquals(wonderwoman,Hero.findHero(2));
    }
}