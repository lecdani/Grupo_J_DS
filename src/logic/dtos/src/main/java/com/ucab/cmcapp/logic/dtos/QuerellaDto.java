package com.ucab.cmcapp.logic.dtos;
import java.util.Date;

public class QuerellaDto extends BaseDto {

    private long _id_querella;
    private Date _fecha_caso;
    private String _descripcion;
    private String _distancia_alejamiento;
    private String _cuenta_atras;
    private String _inamovilidad;

    public QuerellaDto(){}

    public QuerellaDto(long id, long _id_querella) {
        super(id);
        this._id_querella = _id_querella;
    }

    public long get_id_querella() {
        return _id_querella;
    }

    public void set_id_querella(long _id_querella) {
        this._id_querella = _id_querella;
    }

    public Date get_fecha_caso() {
        return _fecha_caso;
    }

    public void set_fecha_caso(Date _fecha_caso) {
        this._fecha_caso = _fecha_caso;
    }

    public String get_descripcion() {
        return _descripcion;
    }

    public void set_descripcion(String _descripcion) {
        this._descripcion = _descripcion;
    }

    public String get_distancia_alejamiento() {
        return _distancia_alejamiento;
    }

    public void set_distancia_alejamiento(String _distancia_alejamiento) {
        this._distancia_alejamiento = _distancia_alejamiento;
    }

    public String get_cuenta_atras() {
        return _cuenta_atras;
    }

    public void set_cuenta_atras(String _cuenta_atras) {
        this._cuenta_atras = _cuenta_atras;
    }

    public String get_inamovilidad() {
        return _inamovilidad;
    }

    public void set_inamovilidad(String _inamovilidad) {
        this._inamovilidad = _inamovilidad;
    }
}
