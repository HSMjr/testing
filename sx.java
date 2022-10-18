class Player {
    public String name;
    public int height;
    public char ROLL;
    public int yr;

    Player() {
        this.name = null;
        this.height = 0;
        this.ROLL = '\0';
        this.yr = 0;
    }

    Player(String str, int h, char R, int y) {
        this.name = str;
        this.height = h;
        this.ROLL = R;
        this.yr = y;
    }
}

class Cricket_Player extends Player {
    public int plc_team;

    Cricket_Player(String str, int h, char R, int y, int place_team) {
        super(str, h, R, y);
        this.plc_team = place_team;
    }

    public void show() {
        System.out.println("\t***** PLAYER INFO ***** \nName : " + name + "\nRoll :" + ROLL + "\nyears :" + yr
                + "\nteam placing :" + plc_team + "\n\n------------------------------------------\n");
    }
}

class Football_Player extends Player {
    public int plc_team;

    Football_Player(String str, int h, char R, int y, int place_team) {
        super(str, h, R, y);
        this.plc_team = place_team;
    }

    public void show() {
        System.out.println("\t***** PLAYER INFO ***** \nName : " + name + "\nRoll :" + ROLL + "\nyears :" + yr
                + "\nteam placing :" + plc_team + "\n\n------------------------------------------\n");
    }
}

class Hockey_Player extends Player {
    public int plc_team;

    Hockey_Player(String str, int h, char R, int y, int place_team) {
        super(str, h, R, y);
        this.plc_team = place_team;
    }

    public void show() {
        System.out.println("\t***** PLAYER INFO ***** \nName : " + name + "\nRoll :" + ROLL + "\nyears :" + yr
                + "\nteam placing :" + plc_team + "\n\n------------------------------------------\n");
    }
}

public class sx {
    public static void main(String args[]) {
        Cricket_Player obj1 = new Cricket_Player("SIUUUUU", 7, 'M', 2, 11);
        Football_Player obj2 = new Football_Player("Aryan", 5, 'S', 5, 4);
        Hockey_Player obj3 = new Hockey_Player("Sidhant", 6, 'G', 1, 9);

        obj1.show();
        obj2.show();
        obj3.show();

    }
}
