package com.erhanbalkan.rentACar.Entities.Concrete;

public class Brand {
    private int _id;
    private String _name;

    public Brand() {
        super();
    }
    public Brand(int id,String name){
        super();
        this._id = id;
        this._name = name;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int id) {
        this._id = id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = name;
    }
}
