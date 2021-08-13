package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela USERACESSO
* @generated
*/
@Entity
@Table(name = "\"USERACESSO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.USERACESSO")
public class USERACESSO implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "ID_USERACESSO", nullable = false, insertable=true, updatable=true)
        private java.lang.String id_USERACESSO = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ID_USER", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private User id_USER;

    /**
    * @generated
    */
    @Column(name = "COD_MUNICIPIO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer coD_MUNICIPIO;

    /**
    * @generated
    */
    @Column(name = "COD_ENTIDADE", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer coD_ENTIDADE;

    /**
    * @generated
    */
    @Column(name = "NRO_ANOFISCAL", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer nrO_ANOFISCAL;

    /**
    * Construtor
    * @generated
    */
    public USERACESSO(){
    }

    /**
    * Obtém id_USERACESSO
    * return id_USERACESSO
    * @generated
    */
    
    public java.lang.String getId_USERACESSO(){
        return this.id_USERACESSO;
    }

    /**
    * Define id_USERACESSO
    * @param id_USERACESSO id_USERACESSO
    * @generated
    */
    public USERACESSO setId_USERACESSO(java.lang.String id_USERACESSO){
        this.id_USERACESSO = id_USERACESSO;
        return this;
    }
    /**
    * Obtém id_USER
    * return id_USER
    * @generated
    */
    
    public User getId_USER(){
        return this.id_USER;
    }

    /**
    * Define id_USER
    * @param id_USER id_USER
    * @generated
    */
    public USERACESSO setId_USER(User id_USER){
        this.id_USER = id_USER;
        return this;
    }
    /**
    * Obtém coD_MUNICIPIO
    * return coD_MUNICIPIO
    * @generated
    */
    
    public java.lang.Integer getCoD_MUNICIPIO(){
        return this.coD_MUNICIPIO;
    }

    /**
    * Define coD_MUNICIPIO
    * @param coD_MUNICIPIO coD_MUNICIPIO
    * @generated
    */
    public USERACESSO setCoD_MUNICIPIO(java.lang.Integer coD_MUNICIPIO){
        this.coD_MUNICIPIO = coD_MUNICIPIO;
        return this;
    }
    /**
    * Obtém coD_ENTIDADE
    * return coD_ENTIDADE
    * @generated
    */
    
    public java.lang.Integer getCoD_ENTIDADE(){
        return this.coD_ENTIDADE;
    }

    /**
    * Define coD_ENTIDADE
    * @param coD_ENTIDADE coD_ENTIDADE
    * @generated
    */
    public USERACESSO setCoD_ENTIDADE(java.lang.Integer coD_ENTIDADE){
        this.coD_ENTIDADE = coD_ENTIDADE;
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
    public USERACESSO setNrO_ANOFISCAL(java.lang.Integer nrO_ANOFISCAL){
        this.nrO_ANOFISCAL = nrO_ANOFISCAL;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
USERACESSO object = (USERACESSO)obj;
        if (id_USERACESSO != null ? !id_USERACESSO.equals(object.id_USERACESSO) : object.id_USERACESSO != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id_USERACESSO == null) ? 0 : id_USERACESSO.hashCode());
        return result;
    }

}