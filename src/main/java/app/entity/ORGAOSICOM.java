package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela ORGAOSICOM
* @generated
*/
@Entity
@Table(name = "\"ORGAOSICOM\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.ORGAOSICOM")
public class ORGAOSICOM implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ORGAOSICOM", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id_ORGAOSICOM;

    /**
    * @generated
    */
    @Column(name = "NRO_ANOFISCAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer nrO_ANOFISCAL;

    /**
    * @generated
    */
    @Column(name = "COD_ORGAOSICOM", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer coD_ORGAOSICOM;

    /**
    * @generated
    */
    @Column(name = "DES_ORGAOSICOM", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String deS_ORGAOSICOM;

    /**
    * @generated
    */
    @Column(name = "COD_CPFGESTOR", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String coD_CPFGESTOR;

    /**
    * @generated
    */
    @Column(name = "DES_NOMEGESTOR", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String deS_NOMEGESTOR;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_LASTREC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date daT_LASTREC;

    /**
    * @generated
    */
    @Column(name = "COD_USUARIO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String coD_USUARIO;

    /**
    * Construtor
    * @generated
    */
    public ORGAOSICOM(){
    }

    /**
    * Obtém id_ORGAOSICOM
    * return id_ORGAOSICOM
    * @generated
    */
    
    public java.lang.Integer getId_ORGAOSICOM(){
        return this.id_ORGAOSICOM;
    }

    /**
    * Define id_ORGAOSICOM
    * @param id_ORGAOSICOM id_ORGAOSICOM
    * @generated
    */
    public ORGAOSICOM setId_ORGAOSICOM(java.lang.Integer id_ORGAOSICOM){
        this.id_ORGAOSICOM = id_ORGAOSICOM;
        return this;
    }
    /**
    * Obtém nrO_ANOFISCAL
    * return nrO_ANOFISCAL
    * @generated
    */
    
    public java.lang.Integer getNrO_ANOFISCAL(){
        return this.nrO_ANOFISCAL;
    }

    /**
    * Define nrO_ANOFISCAL
    * @param nrO_ANOFISCAL nrO_ANOFISCAL
    * @generated
    */
    public ORGAOSICOM setNrO_ANOFISCAL(java.lang.Integer nrO_ANOFISCAL){
        this.nrO_ANOFISCAL = nrO_ANOFISCAL;
        return this;
    }
    /**
    * Obtém coD_ORGAOSICOM
    * return coD_ORGAOSICOM
    * @generated
    */
    
    public java.lang.Integer getCoD_ORGAOSICOM(){
        return this.coD_ORGAOSICOM;
    }

    /**
    * Define coD_ORGAOSICOM
    * @param coD_ORGAOSICOM coD_ORGAOSICOM
    * @generated
    */
    public ORGAOSICOM setCoD_ORGAOSICOM(java.lang.Integer coD_ORGAOSICOM){
        this.coD_ORGAOSICOM = coD_ORGAOSICOM;
        return this;
    }
    /**
    * Obtém deS_ORGAOSICOM
    * return deS_ORGAOSICOM
    * @generated
    */
    
    public java.lang.String getDeS_ORGAOSICOM(){
        return this.deS_ORGAOSICOM;
    }

    /**
    * Define deS_ORGAOSICOM
    * @param deS_ORGAOSICOM deS_ORGAOSICOM
    * @generated
    */
    public ORGAOSICOM setDeS_ORGAOSICOM(java.lang.String deS_ORGAOSICOM){
        this.deS_ORGAOSICOM = deS_ORGAOSICOM;
        return this;
    }
    /**
    * Obtém coD_CPFGESTOR
    * return coD_CPFGESTOR
    * @generated
    */
    
    public java.lang.String getCoD_CPFGESTOR(){
        return this.coD_CPFGESTOR;
    }

    /**
    * Define coD_CPFGESTOR
    * @param coD_CPFGESTOR coD_CPFGESTOR
    * @generated
    */
    public ORGAOSICOM setCoD_CPFGESTOR(java.lang.String coD_CPFGESTOR){
        this.coD_CPFGESTOR = coD_CPFGESTOR;
        return this;
    }
    /**
    * Obtém deS_NOMEGESTOR
    * return deS_NOMEGESTOR
    * @generated
    */
    
    public java.lang.String getDeS_NOMEGESTOR(){
        return this.deS_NOMEGESTOR;
    }

    /**
    * Define deS_NOMEGESTOR
    * @param deS_NOMEGESTOR deS_NOMEGESTOR
    * @generated
    */
    public ORGAOSICOM setDeS_NOMEGESTOR(java.lang.String deS_NOMEGESTOR){
        this.deS_NOMEGESTOR = deS_NOMEGESTOR;
        return this;
    }
    /**
    * Obtém daT_LASTREC
    * return daT_LASTREC
    * @generated
    */
    
    public java.util.Date getDaT_LASTREC(){
        return this.daT_LASTREC;
    }

    /**
    * Define daT_LASTREC
    * @param daT_LASTREC daT_LASTREC
    * @generated
    */
    public ORGAOSICOM setDaT_LASTREC(java.util.Date daT_LASTREC){
        this.daT_LASTREC = daT_LASTREC;
        return this;
    }
    /**
    * Obtém coD_USUARIO
    * return coD_USUARIO
    * @generated
    */
    
    public java.lang.String getCoD_USUARIO(){
        return this.coD_USUARIO;
    }

    /**
    * Define coD_USUARIO
    * @param coD_USUARIO coD_USUARIO
    * @generated
    */
    public ORGAOSICOM setCoD_USUARIO(java.lang.String coD_USUARIO){
        this.coD_USUARIO = coD_USUARIO;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
ORGAOSICOM object = (ORGAOSICOM)obj;
        if (id_ORGAOSICOM != null ? !id_ORGAOSICOM.equals(object.id_ORGAOSICOM) : object.id_ORGAOSICOM != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id_ORGAOSICOM == null) ? 0 : id_ORGAOSICOM.hashCode());
        return result;
    }

}