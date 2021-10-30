import java.util.ArrayList;
import java.util.List;

public class Spuad {

    private String name;
    private int size;
    private String cause;
    private int id;
    private List<Hero> heroes = new ArrayList<Hero>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public List<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(List<Hero> heroes) {
        this.heroes = heroes;
    }

    public void addHero(Hero hero) {
        if (heroes.size()<this.getSize()) {
            heroes.add(hero);
        }
    }

    public void removeHeroes() {
        heroes.clear();
    }

    public static Squad find(int n) {
        return apperance.get(n-1);
    }

    public static void clearSquads() {
        apperance.clear();
    }
}
