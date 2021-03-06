//package draw10AtStart;

import java.util.ArrayList;

public class Player {
    private String name;
    private String password;

    // private ArrayList<Pet> pets;
    public Player(String name, String cs) {
        this.name = name;
        this.password = cs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        String n = new String(password);
        return n;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", password=" + password + "]";
    }

}
