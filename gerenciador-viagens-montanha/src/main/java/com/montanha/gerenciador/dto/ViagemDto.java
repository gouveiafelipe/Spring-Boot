package com.montanha.gerenciador.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.util.Date;

public class ViagemDto implements Serializable {

    private static final long serialVersionUID = -8105241933692707649L;

    private Long id;

    private String localDestino;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dataPartida;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dataRetorno;

    private String acompanhante;

    public ViagemDto(){}


    public Long getId() {
        return id;
    }


    @NotNull
    @Length(min = 3, max = 40, message = "Local de destino deve estar entre 3 a 40 caracteres")
    public String getLocalDestino() {
        return localDestino;
    }

    public void setLocalDestino(String localDestino) {
        this.localDestino = localDestino;
    }

    @NotNull
    public Date getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(Date dataPartida) {
        this.dataPartida = dataPartida;
    }

    public Date getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(Date dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public String getAcompanhante() {
        return acompanhante;
    }

    public void setAcompanhante(String acompanhante) {
        this.acompanhante = acompanhante;
    }

    @Override
    public String toString() {
        return "ViagemDto [id=" + id + ", localDestino=" + localDestino + ", dataPartida=" + dataPartida
                + ", dataRetorno=" + dataRetorno + ", acompanhante=" + acompanhante + "]";
    }
}
