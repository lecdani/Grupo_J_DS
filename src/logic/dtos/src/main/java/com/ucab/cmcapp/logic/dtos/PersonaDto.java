package com.ucab.cmcapp.logic.dtos;

import java.util.Date;

public class PersonaDto extends BaseDto
{
    private Long _id_persona;
    private String _primer_nombre;
    private String _primer_apellido;
    private String _segundo_nombre;
    private String _segundo_apellido;
    private char _sexo;
    private Date _fec_nac;

    public PersonaDto()
    {
    }

    public PersonaDto(long id) {
        super(id);
    }

    public void set_id_persona(Long _id_persona) {
        this._id_persona = _id_persona;
    }

    public void set_primer_nombre(String _primer_nombre) {
        this._primer_nombre = _primer_nombre;
    }

    public void set_primer_apellido(String _primer_apellido) {
        this._primer_apellido = _primer_apellido;
    }

    public void set_segundo_nombre(String _segundo_nombre) {
        this._segundo_nombre = _segundo_nombre;
    }

    public void set_segundo_apellido(String _segundo_apellido) {
        this._segundo_apellido = _segundo_apellido;
    }

    public void set_sexo(char _sexo) {
        this._sexo = _sexo;
    }

    public void set_fec_nac(Date _fec_nac) {
        this._fec_nac = _fec_nac;
    }

    public Long get_id_persona() {
        return _id_persona;
    }

    public String get_primer_nombre() {
        return _primer_nombre;
    }

    public String get_primer_apellido() {
        return _primer_apellido;
    }

    public String get_segundo_nombre() {
        return _segundo_nombre;
    }

    public String get_segundo_apellido() {
        return _segundo_apellido;
    }

    public char get_sexo() {
        return _sexo;
    }

    public Date get_fec_nac() {
        return _fec_nac;
    }
}
