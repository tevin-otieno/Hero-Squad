import java.util.ArrayList;
import java.util.List;

public class Squad {

    private String name;
    private int size;
    private String cause;
    private int id;
    private static ArrayList<Squad> apperance = new ArrayList<Squad>();
    private List<Hero> heroes = new ArrayList<Hero>();

    public Squad(String name, int size, String cause) {
        this.name = name;
        this.size = size;
        this.cause = cause;
        apperance.add(this);
        this.id = apperance.size();
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static ArrayList<Squad> getApperance() {
        return apperance;
    }

    public static void setApperance(ArrayList<Squad> apperance) {
        Squad.apperance = apperance;
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

    public void removeHero(Hero hero) {
        heroes.remove(hero);
    }

    public void removeHeroes() {
        heroes.clear();
    }

    public static void clearSquads() {
        apperance.clear();
    }

    public static Squad find(int n) {
        return apperance.get(n-1);
    }

    public static ArrayList<Squad> getSquads() {
        return apperance;
    }
}
