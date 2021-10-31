import java.util.ArrayList;
import java.util.List;

public class Hero {

    private String name;
    private String power;
    private String weakness;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSquadId() {
        return squadId;
    }

    public void setSquadId(int squadId) {
        this.squadId = squadId;
    }

    public static List<Hero> getAppearance() {
        return appearance;
    }

    public static void setAppearance(List<Hero> appearance) {
        Hero.appearance = appearance;
    }

    private int id;
    private int squadId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    private static List<Hero> appearance = new ArrayList<Hero>();

    public Hero(String name, String power, String weakness, int squadId) {
        this.name = name;
        this.power = power;
        this.weakness = weakness;
        this.squadId = squadId;
        Squad squad = Squad.find(squadId);
        squad.addHero(this);
        appearance.add(this);
        this.id = appearance.size();
    }
    public static Hero findHero(int n) {
        return appearance.get(n-1);
    }

    public static void clearAll() {
        appearance.clear();
    }

    public static List<Hero> getHeroes() {
        return appearance;
    }
}
