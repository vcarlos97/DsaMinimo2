package edu.upc.login.Entidades;

public class User {

    public String id;
    public String nombre;
    public String mail;
    public String password;

    public User(){}

    public User(String id, String nombre, String mail, String password) {
        this();
        this.id = id;
        this.nombre = nombre;
        this.mail = mail;
        this.password = password;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [id="+id+", name=" + nombre + ", mail=" + mail +"]";
    }

}