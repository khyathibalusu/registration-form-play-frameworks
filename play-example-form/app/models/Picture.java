package models;

import java.sql.Blob;

import javax.persistence.Entity;

import play.db.ebean.Model;

@Entity
public class Picture extends Model {
    public Blob image;  
}
