package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela CT_CTCORA
* @generated
*/
@Entity
@Table(name = "\"CT_CTCORA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.CT_CTCORA")
public class CT_CTCORA implements Serializable {

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
    @Column(name = "COD_VRS", nullable = true, unique = false, length=3, insertable=true, updatable=true)
        
        private java.lang.String coD_VRS;

    /**
    * @generated
    */
    @Column(name = "DES_VRS", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String deS_VRS;

    /**
    * @generated
    */
    @Column(name = "SIT_VRS", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String siT_VRS;

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
    @JoinColumn(name="ID_CT_CTCOR", nullable = true, referencedColumnName = "ID", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private CT_CTCOR id_CT_CTCOR;

    /**
    * Construtor
    * @generated
    */
    public CT_CTCORA(){
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
    public CT_CTCORA setId(java.lang.Integer id){
        this.id = id;
        return this;
    }
    /**
    * Obtém coD_VRS
    * return coD_VRS
    * @generated
    */
    
    public java.lang.String getCoD_VRS(){
        return this.coD_VRS;
    }

    /**
    * Define coD_VRS
    * @param coD_VRS coD_VRS
    * @generated
    */
    public CT_CTCORA setCoD_VRS(java.lang.String coD_VRS){
        this.coD_VRS = coD_VRS;
        return this;
    }
    /**
    * Obtém deS_VRS
    * return deS_VRS
    * @generated
    */
    
    public java.lang.String getDeS_VRS(){
        return this.deS_VRS;
    }

    /**
    * Define deS_VRS
    * @param deS_VRS deS_VRS
    * @generated
    */
    public CT_CTCORA setDeS_VRS(java.lang.String deS_VRS){
        this.deS_VRS = deS_VRS;
        return this;
    }
    /**
    * Obtém siT_VRS
    * return siT_VRS
    * @generated
    */
    
    public java.lang.String getSiT_VRS(){
        return this.siT_VRS;
    }

    /**
    * Define siT_VRS
    * @param siT_VRS siT_VRS
    * @generated
    */
    public CT_CTCORA setSiT_VRS(java.lang.String siT_VRS){
        this.siT_VRS = siT_VRS;
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
    public CT_CTCORA setCoD_USUARIO(java.lang.String coD_USUARIO){
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
    public CT_CTCORA setDaT_LASTREC(java.util.Date daT_LASTREC){
        this.daT_LASTREC = daT_LASTREC;
        return this;
    }
    /**
    * Obtém id_CT_CTCOR
    * return id_CT_CTCOR
    * @generated
    */
    
    public CT_CTCOR getId_CT_CTCOR(){
        return this.id_CT_CTCOR;
    }

    /**
    * Define id_CT_CTCOR
    * @param id_CT_CTCOR id_CT_CTCOR
    * @generated
    */
    public CT_CTCORA setId_CT_CTCOR(CT_CTCOR id_CT_CTCOR){
        this.id_CT_CTCOR = id_CT_CTCOR;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
CT_CTCORA object = (CT_CTCORA)obj;
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