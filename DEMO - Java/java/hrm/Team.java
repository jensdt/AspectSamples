package hrm;

import java.lang.*;
import java.util.*;

public class Team extends java.lang.Object {
    private List<Person> members = new ArrayList<Person>();

    private String name;

     public Team(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPerson(Person p) throws PersonAlreadyAssignedException {
        if(p.hasTeam()) throw new PersonAlreadyAssignedException();
        members.add(p);
        p.setTeam(this);
    }

    public void removePerson(Person p) {
        members.remove(p);
        p.setTeam(null);
    }

}