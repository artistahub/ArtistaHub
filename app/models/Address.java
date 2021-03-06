package models;

import java.util.*;
import javax.persistence.*;
import com.avaje.ebean.Ebean;
import play.db.ebean.*;


@Entity
@Table (name="address")
public class Address extends Model {

    @Id
    private String id = UUID.randomUUID().toString().replaceAll("-","");
    private String address;
    private String city;
    private String state;
    private String zip;
    private String country;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;

    public Address ( String city, String state, String zip, String country){
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.dateCreated = new Date();
    }

   private static Model.Finder<Long, Address> find = new Model.Finder<Long, Address>(Long.class, Address.class);

    public static Finder<Long, Address> getFind() {
        return find;
    }

    public static void setFind(Finder<Long, Address> find) {
        Address.find = find;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public static Address createAddress(){
        Address a = new Address( "Berkely", "CA", "94704", "USA");
        a.save();
        return  a;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
