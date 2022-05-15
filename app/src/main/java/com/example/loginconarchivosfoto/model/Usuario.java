package com.example.loginconarchivosfoto.model;

import android.graphics.Bitmap;

import java.io.Serializable;

public class Usuario implements Serializable {
    private long dni;
    private String apellido;
    private String nombre;
    private String mail;
    private String password;
    private byte [] b;

    public Usuario(long dni, String apellido, String nombre, String mail, String password, byte [] imagenBit) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.mail = mail;
        this.password = password;
        this.b = imagenBit;
    }

    public Usuario(){}

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public byte[] getB() {
        return b;
    }

    public void setB(byte[] b) {
        this.b = b;
    }
}
