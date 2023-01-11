
package com.xenock.api.models;

public class Cliente {
    private long id;
    private String name;
    private String surname;

    public Cliente() {
    }

    public Cliente(long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    
    
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    
}
