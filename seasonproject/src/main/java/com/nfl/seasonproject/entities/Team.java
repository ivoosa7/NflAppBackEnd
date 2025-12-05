package com.nfl.seasonproject.entities;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import java.util.Objects;

@Document(collection = "teams")
public class Team implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private String nomeFranquia;
    private String cidade;
    private String local;
    private String estadio;
    private String conferencia;
    private String divisao;
    private String titulosSuperbowl;

    public Team() {
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNomeFranquia() {
        return nomeFranquia;
    }
    public void setNomeFranquia(String nomeFranquia) {
        this.nomeFranquia = nomeFranquia;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getEstadio() {
        return estadio;
    }
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
    public String getConferencia() {
        return conferencia;
    }
    public void setConferencia(String conferencia) {
        this.conferencia = conferencia;
    }
    public String getDivisao() {
        return divisao;
    }
    public void setDivisao(String divisao) {
        this.divisao = divisao;
    }
    public String getTitulosSuperbowl() {
        return titulosSuperbowl;
    }
    public void setTitulosSuperbowl(String titulosSuperbowl) {
        this.titulosSuperbowl = titulosSuperbowl;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Team other = (Team) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
