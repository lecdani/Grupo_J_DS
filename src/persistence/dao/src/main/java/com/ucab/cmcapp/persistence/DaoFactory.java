package com.ucab.cmcapp.persistence;

import com.ucab.cmcapp.persistence.dao.*;

public class DaoFactory
{
    private DaoFactory() {}

    public static UserDao createUserDao( DBHandler handler )
    {
        return new UserDao( handler );
    }

    public static UsuarioDao createUsuarioDao ( DBHandler handler){
        return new UsuarioDao( handler );
    }

    public static PersonaDao createPersonaDao ( DBHandler handler){
        return new PersonaDao( handler );
    }

}
