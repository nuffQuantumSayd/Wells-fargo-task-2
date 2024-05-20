package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientId;

    @Column(nullable = false)
    private long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    protected Client() {

    }
    public Client(long aId, String fName, String lName,
                  String address, String phone, String email) {
        advisorId = aId;
        firstName = fName;
        lastName = lName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    //get client id
    public long getClientId() {
        return clientId;
    }

    //get advisor id
    public long getAdvisorId() {
        return advisorId;
    }

    //first name getter/setter
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String value) {
        firstName = value;
    }

    //last name getter/setter
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String value) {
        lastName = value;
    }

    //address getter/setter
    public String getAddress() {
        return address;
    }
    public void setAddress(String value) {
        address = value;
    }

    //phone getter/setter
    public String getPhone() {
        return phone;
    }
    public void setPhone(String value) {
        phone = value;
    }

    //email getter/setter
    public String getEmail() {
        return email;
    }
    public void setEmail(String value) {
        email = value;
    }

}
