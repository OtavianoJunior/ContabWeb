package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela MUNICIPIO
* @generated
*/
@Entity
@Table(name = "\"MUNICIPIO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.MUNICIPIO")
public class MUNICIPIO implements Serializable {

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
    @Column(name = "ID_MUNICIPIO", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id_MUNICIPIO;

    /**
    * @generated
    */
    @Column(name = "COD_MUNICIPIO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer coD_MUNICIPIO;

    /**
    * @generated
    */
    @Column(name = "DES_MUNICIPIO", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String deS_MUNICIPIO;

    /**
    * @generated
    */
    @Column(name = "NRO_SIAF", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer nrO_SIAF;

    /**
    * @generated
    */
    @Column(name = "COD_MUNICIPIOSICOM", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer coD_MUNICIPIOSICOM;

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
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_UF", nullable = true, referencedColumnName = "ID_UF", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private UF id_UF;

    /**
    * Construtor
    * @generated
    */
    public MUNICIPIO(){
    }

    /**
    * Obtém id_MUNICIPIO
    * return id_MUNICIPIO
    * @generated
    */
    
    public java.lang.Integer getId_MUNICIPIO(){
        return this.id_MUNICIPIO;
    }

    /**
    * Define id_MUNICIPIO
    * @param id_MUNICIPIO id_MUNICIPIO
    * @generated
    */
    public MUNICIPIO setId_MUNICIPIO(java.lang.Integer id_MUNICIPIO){
        this.id_MUNICIPIO = id_MUNICIPIO;
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
    public MUNICIPIO setCoD_MUNICIPIO(java.lang.Integer coD_MUNICIPIO){
        this.coD_MUNICIPIO = coD_MUNICIPIO;
        return this;
    }
    /**
    * Obtém deS_MUNICIPIO
    * return deS_MUNICIPIO
    * @generated
    */
    
    public java.lang.String getDeS_MUNICIPIO(){
        return this.deS_MUNICIPIO;
    }

    /**
    * Define deS_MUNICIPIO
    * @param deS_MUNICIPIO deS_MUNICIPIO
    * @generated
    */
    public MUNICIPIO setDeS_MUNICIPIO(java.lang.String deS_MUNICIPIO){
        this.deS_MUNICIPIO = deS_MUNICIPIO;
        return this;
    }
    /**
    * Obtém nrO_SIAF
    * return nrO_SIAF
    * @generated
    */
    
    public java.lang.Integer getNrO_SIAF(){
        return this.nrO_SIAF;
    }

    /**
    * Define nrO_SIAF
    * @param nrO_SIAF nrO_SIAF
    * @generated
    */
    public MUNICIPIO setNrO_SIAF(java.lang.Integer nrO_SIAF){
        this.nrO_SIAF = nrO_SIAF;
        return this;
    }
    /**
    * Obtém coD_MUNICIPIOSICOM
    * return coD_MUNICIPIOSICOM
    * @generated
    */
    
    public java.lang.Integer getCoD_MUNICIPIOSICOM(){
        return this.coD_MUNICIPIOSICOM;
    }

    /**
    * Define coD_MUNICIPIOSICOM
    * @param coD_MUNICIPIOSICOM coD_MUNICIPIOSICOM
    * @generated
    */
    public MUNICIPIO setCoD_MUNICIPIOSICOM(java.lang.Integer coD_MUNICIPIOSICOM){
        this.coD_MUNICIPIOSICOM = coD_MUNICIPIOSICOM;
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
    public MUNICIPIO setDaT_LASTREC(java.util.Date daT_LASTREC){
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
    public MUNICIPIO setCoD_USUARIO(java.lang.String coD_USUARIO){
        this.coD_USUARIO = coD_USUARIO;
        return this;
    }
    /**
    * Obtém id_UF
    * return id_UF
    * @generated
    */
    
    public UF getId_UF(){
        return this.id_UF;
    }

    /**
    * Define id_UF
    * @param id_UF id_UF
    * @generated
    */
    public MUNICIPIO setId_UF(UF id_UF){
        this.id_UF = id_UF;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
MUNICIPIO object = (MUNICIPIO)obj;
        if (id_MUNICIPIO != null ? !id_MUNICIPIO.equals(object.id_MUNICIPIO) : object.id_MUNICIPIO != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id_MUNICIPIO == null) ? 0 : id_MUNICIPIO.hashCode());
        return result;
    }

}