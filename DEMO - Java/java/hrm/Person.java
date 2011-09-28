package hrm;

import java.lang.*;

public class Person extends java.lang.Object {
    private String name;

    private Team team;

     public Person(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    void setTeam(Team t) {
        team = t;
    }

    public Team getTeam() {
        return team;
    }

    public boolean hasTeam() {
        return (team) != (null);
    }

    public String getName() {
        return this.name;
    }

}