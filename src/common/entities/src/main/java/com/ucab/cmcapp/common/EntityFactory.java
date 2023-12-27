package com.ucab.cmcapp.common;

import com.ucab.cmcapp.common.entities.*;

public class EntityFactory

{
    /**
     * Method that returns an instance of User class
     */
    public static User createUser()
    {
        return new User();
    }

    /**
     * Method that returns an instance of User class
     */
    public static User createUser(long id)
    {
        return new User(id);
    }

    /**
     * Method that returns an instance of UserType class
     */
    public static UserType createUserType()
    {
        return new UserType();
    }

    /**
     * Method that returns an instance of UserType class
     */
    public static UserType createUserType(long id)
    {
        return new UserType(id);
    }

    public static Persona createPersona(){
        return new Persona();
    }

    public static Persona createPersona(Long _id_persona){
        return new Persona(_id_persona);
    }

    public static Usuario createUsuario() {
        return new Usuario();
    }

    public  static Usuario createUsuario( long _id_usuario ){
        return new Usuario(_id_usuario);
    }
}
