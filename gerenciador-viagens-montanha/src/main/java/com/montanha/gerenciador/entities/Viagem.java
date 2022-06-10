package com.montanha.gerenciador.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Component //classe sera gerenciada pelos containers do spring
@Table(name = "viagem")
public class Viagem implements Serializable {

    private static final long serialVersionUID = -6888542263201514002L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "local_destino", nullable = false)
    private String localDestino;

    @JsonSerialize(using = DateSerializer.class)
    @Column(name = "data_retorno")
    private Date dataRetorno;

    @JsonSerialize(using = DateSerializer.class)
    @Column(name = "data_partida", nullable = false)
    private Date dataPartida;

    @Column(name = "acompanhante")
    private String acompanhante;

    public Viagem(){}

    public Viagem(Long id, String localDestino, Date dataRetorno, Date dataPartida, String acompanhante) {
        this.id = id;
        this.localDestino = localDestino;
        this.dataRetorno = dataRetorno;
        this.dataPartida = dataPartida;
        this.acompanhante = acompanhante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocalDestino() {
        return localDestino;
    }

    public void setLocalDestino(String localDestino) {
        this.localDestino = localDestino;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public Date getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(Date dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public Date getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(Date dataPartida) {
        this.dataPartida = dataPartida;
    }

    public String getAcompanhante() {
        return acompanhante;
    }

    public void setAcompanhante(String acompanhante) {
        this.acompanhante = acompanhante;
    }

    @Override
    public String toString() {
        return "Viagem [id=" + id + ", localDestino=" + localDestino + ", dataPartida=" + dataPartida
                + ", dataRetorno=" + dataRetorno + ", acompanhante=" + acompanhante + "]";
    }
}
