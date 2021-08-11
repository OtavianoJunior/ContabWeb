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
    @Column(name = "ID_USER", nullable = false, insertable=true, updatable=true)
        private java.lang.String id_USER = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ID_ENTIDADE", nullable = true, referencedColumnName = "ID_ENTIDADE", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private ENTIDADE id_ENTIDADE;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ID_ANOFISCAL", nullable = true, referencedColumnName = "ID_ANOFISCAL", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private ANOFISCALENTIDADE id_ANOFISCAL;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private User user;

    /**
    * Construtor
    * @generated
    */
    public USERACESSO(){
    }

    /**
    * Obtém id_USER
    * return id_USER
    * @generated
    */
    
    public java.lang.String getId_USER(){
        return this.id_USER;
    }

    /**
    * Define id_USER
    * @param id_USER id_USER
    * @generated
    */
    public USERACESSO setId_USER(java.lang.String id_USER){
        this.id_USER = id_USER;
        return this;
    }
    /**
    * Obtém id_ENTIDADE
    * return id_ENTIDADE
    * @generated
    */
    
    public ENTIDADE getId_ENTIDADE(){
        return this.id_ENTIDADE;
    }

    /**
    * Define id_ENTIDADE
    * @param id_ENTIDADE id_ENTIDADE
    * @generated
    */
    public USERACESSO setId_ENTIDADE(ENTIDADE id_ENTIDADE){
        this.id_ENTIDADE = id_ENTIDADE;
        return this;
    }
    /**
    * Obtém id_ANOFISCAL
    * return id_ANOFISCAL
    * @generated
    */
    
    public ANOFISCALENTIDADE getId_ANOFISCAL(){
        return this.id_ANOFISCAL;
    }

    /**
    * Define id_ANOFISCAL
    * @param id_ANOFISCAL id_ANOFISCAL
    * @generated
    */
    public USERACESSO setId_ANOFISCAL(ANOFISCALENTIDADE id_ANOFISCAL){
        this.id_ANOFISCAL = id_ANOFISCAL;
        return this;
    }
    /**
    * Obtém user
    * return user
    * @generated
    */
    
    public User getUser(){
        return this.user;
    }

    /**
    * Define user
    * @param user user
    * @generated
    */
    public USERACESSO setUser(User user){
        this.user = user;
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
        if (id_USER != null ? !id_USER.equals(object.id_USER) : object.id_USER != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id_USER == null) ? 0 : id_USER.hashCode());
        return result;
    }

}