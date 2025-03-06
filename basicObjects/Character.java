public class Character {
    // Three things to worry about:
    // 1. Attributes (Declare at top)
    // all charactres will share these
    private String name;
    private String race; // Human, elf, dwarf, etc.
    private int level; 
    private int xp;
    private int maxHp;
    private int curHp;
    private int[] xpChart = {1000, 2000, 4000, 8000, 16000, 32000};

    // 2. Constructors (Functions that build the instance)
    // Default constructor takes no parameters and sets values to some
    // sensible default so they're not in an unknown state.
    public Character() {
       this.name = "";
       this.race = "human";
       this.level = 1;
       this.xp = 0;
       this.maxHp = 0;
       this.curHp = 0;
    }

    public Character(String name, String race, int level, int xp, int hp) {
        this.name = name;
        this.race = race;
        this.level = level;
        this.xp = xp;
        this.maxHp = hp;
        this.curHp = hp;
    }

    public Character(String name, String race, int hp) {
        this.name = name;
        this.race = race;
        this.level = 1;
        this.xp = 0;
        this.maxHp = hp;
        this.curHp = hp;
    }

    // 3. Methods (functions)
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Race: " + race);
        System.out.println("Level: " + level + "XP: " + xp);
        System.out.println("HP: " + curHp + "/" + maxHp);
    }

    public void addXp(int amt) {
        xp += amt;
        int nextLevelNeeded = xpChart[level - 1]; // sub 1 b/c of zero index
        if (xp > nextLevelNeeded) {
            level += 1;
        }
    }

    public void applyDamage(int dmg) {
        curHp = Math.max(0, curHp - dmg);
    }

    public void applyHealing(int amt) {
        curHp = Math.min(maxHp, curHp + amt);
    }

    // Getters and Setters
    public int getCurHp() {
        return(curHp);
    }

    // public void setCurHp(int newHp) {
    //     if (newHp > maxHp) {
    //         // HP Too High
    //         curHp = maxHp;
    //     } else if (newHp < 0) {
    //         // HP Too Low
    //         curHp = 0;
    //     } else {
    //         // HP in range
    //         curHp = newHp;
    //     }
    // }

    public String getName() {
        return (name);
    }

    public void setName(String n) {
        name = n;
    }

    public int getLevel() {
        return (level);
    }
}