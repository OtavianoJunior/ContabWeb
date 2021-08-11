package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela UF
* @generated
*/
@Entity
@Table(name = "\"UF\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.UF")
public class UF implements Serializable {

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
    @Column(name = "ID_UF", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id_UF;

    /**
    * @generated
    */
    @Column(name = "COD_UF", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String coD_UF;

    /**
    * @generated
    */
    @Column(name = "DES_UF", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String deS_UF;

    /**
    * @generated
    */
    @Column(name = "COD_IBGE", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer coD_IBGE;

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
    public UF(){
    }

    /**
    * Obtém id_UF
    * return id_UF
    * @generated
    */
    
    public java.lang.Integer getId_UF(){
        return this.id_UF;
    }

    /**
    * Define id_UF
    * @param id_UF id_UF
    * @generated
    */
    public UF setId_UF(java.lang.Integer id_UF){
        this.id_UF = id_UF;
        return this;
    }
    /**
    * Obtém coD_UF
    * return coD_UF
    * @generated
    */
    
    public java.lang.String getCoD_UF(){
        return this.coD_UF;
    }

    /**
    * Define coD_UF
    * @param coD_UF coD_UF
    * @generated
    */
    public UF setCoD_UF(java.lang.String coD_UF){
        this.coD_UF = coD_UF;
        return this;
    }
    /**
    * Obtém deS_UF
    * return deS_UF
    * @generated
    */
    
    public java.lang.String getDeS_UF(){
        return this.deS_UF;
    }

    /**
    * Define deS_UF
    * @param deS_UF deS_UF
    * @generated
    */
    public UF setDeS_UF(java.lang.String deS_UF){
        this.deS_UF = deS_UF;
        return this;
    }
    /**
    * Obtém coD_IBGE
    * return coD_IBGE
    * @generated
    */
    
    public java.lang.Integer getCoD_IBGE(){
        return this.coD_IBGE;
    }

    /**
    * Define coD_IBGE
    * @param coD_IBGE coD_IBGE
    * @generated
    */
    public UF setCoD_IBGE(java.lang.Integer coD_IBGE){
        this.coD_IBGE = coD_IBGE;
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
    public UF setDaT_LASTREC(java.util.Date daT_LASTREC){
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
    public UF setCoD_USUARIO(java.lang.String coD_USUARIO){
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
UF object = (UF)obj;
        if (id_UF != null ? !id_UF.equals(object.id_UF) : object.id_UF != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id_UF == null) ? 0 : id_UF.hashCode());
        return result;
    }

}