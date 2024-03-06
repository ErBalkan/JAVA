package Entities;

import Core.Entities.IEntity;

public class Brand implements IEntity {
    private int _id;
    private String _name;

    public int getId(){
        return this._id;
    }
    public void setId(int id){
        this._id = id;
    }

    public String getName(){
        return this._name;
    }
    public void setName(String name){
        this._name = name;
    }
}
