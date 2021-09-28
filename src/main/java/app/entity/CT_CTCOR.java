package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela CT_CTCOR
* @generated
*/
@Entity
@Table(name = "\"CT_CTCOR\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.CT_CTCOR")
public class CT_CTCOR implements Serializable {

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
    @Column(name = "ID", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id;

    /**
    * @generated
    */
    @Column(name = "COD_CTCOR", nullable = true, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.String coD_CTCOR;

    /**
    * @generated
    */
    @Column(name = "DES_CTCOR", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String deS_CTCOR;

    /**
    * @generated
    */
    @Column(name = "COD_USUARIO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String coD_USUARIO;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_LASTREC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date daT_LASTREC;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_ENTIDADE", nullable = true, referencedColumnName = "ID_ENTIDADE", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private ENTIDADE enTIDADE;

    /**
    * Construtor
    * @generated
    */
    public CT_CTCOR(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.Integer getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public CT_CTCOR setId(java.lang.Integer id){
        this.id = id;
        return this;
    }
    /**
    * Obtém coD_CTCOR
    * return coD_CTCOR
    * @generated
    */
    
    public java.lang.String getCoD_CTCOR(){
        return this.coD_CTCOR;
    }

    /**
    * Define coD_CTCOR
    * @param coD_CTCOR coD_CTCOR
    * @generated
    */
    public CT_CTCOR setCoD_CTCOR(java.lang.String coD_CTCOR){
        this.coD_CTCOR = coD_CTCOR;
        return this;
    }
    /**
    * Obtém deS_CTCOR
    * return deS_CTCOR
    * @generated
    */
    
    public java.lang.String getDeS_CTCOR(){
        return this.deS_CTCOR;
    }

    /**
    * Define deS_CTCOR
    * @param deS_CTCOR deS_CTCOR
    * @generated
    */
    public CT_CTCOR setDeS_CTCOR(java.lang.String deS_CTCOR){
        this.deS_CTCOR = deS_CTCOR;
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
    public CT_CTCOR setCoD_USUARIO(java.lang.String coD_USUARIO){
        this.coD_USUARIO = coD_USUARIO;
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
    public CT_CTCOR setDaT_LASTREC(java.util.Date daT_LASTREC){
        this.daT_LASTREC = daT_LASTREC;
        return this;
    }
    /**
    * Obtém enTIDADE
    * return enTIDADE
    * @generated
    */
    
    public ENTIDADE getEnTIDADE(){
        return this.enTIDADE;
    }

    /**
    * Define enTIDADE
    * @param enTIDADE enTIDADE
    * @generated
    */
    public CT_CTCOR setEnTIDADE(ENTIDADE enTIDADE){
        this.enTIDADE = enTIDADE;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
CT_CTCOR object = (CT_CTCOR)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}