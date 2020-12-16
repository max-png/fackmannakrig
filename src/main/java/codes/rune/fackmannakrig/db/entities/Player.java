package codes.rune.fackmannakrig.db.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {

    @Id
    @GeneratedValue
    public int id;

    public String name;
    public int fighterId;

}
