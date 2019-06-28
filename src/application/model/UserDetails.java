package application.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "username")
    private String username;
    @ElementCollection
   private Set<Address> listOfAddress= new HashSet<>();

    public Set<Address> getListOfAddress() {
        return listOfAddress;
    }

    public void setListOfAddress(Set<Address> listOfAddress) {
        this.listOfAddress = listOfAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
