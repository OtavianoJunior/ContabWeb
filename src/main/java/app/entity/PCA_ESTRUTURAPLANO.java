package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PCA_ESTRUTURAPLANO
* @generated
*/
@Entity
@Table(name = "\"PCA_ESTRUTURAPLANO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PCA_ESTRUTURAPLANO")
public class PCA_ESTRUTURAPLANO implements Serializable {

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
    @Column(name = "ID_ESTRUTURAPLANO", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id_ESTRUTURAPLANO;

    /**
    * @generated
    */
    @Column(name = "COD_ESTRUTURA", nullable = true, unique = false, length=6, insertable=true, updatable=true)
        
        private java.lang.String coD_ESTRUTURA;

    /**
    * @generated
    */
    @Column(name = "DES_ESTRUTURA", nullable = true, unique = false, length=100, insertable=true, updatable=true, columnDefinition = "TEXT")
        
        private java.lang.String deS_ESTRUTURA;

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
    @JoinColumn(name="ID_ENTIDADE", nullable = true, referencedColumnName = "ID_ENTIDADE", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private ENTIDADE id_ENTIDADE;

    /**
    * Construtor
    * @generated
    */
    public PCA_ESTRUTURAPLANO(){
    }

    /**
    * Obtém id_ESTRUTURAPLANO
    * return id_ESTRUTURAPLANO
    * @generated
    */
    
    public java.lang.Integer getId_ESTRUTURAPLANO(){
        return this.id_ESTRUTURAPLANO;
    }

    /**
    * Define id_ESTRUTURAPLANO
    * @param id_ESTRUTURAPLANO id_ESTRUTURAPLANO
    * @generated
    */
    public PCA_ESTRUTURAPLANO setId_ESTRUTURAPLANO(java.lang.Integer id_ESTRUTURAPLANO){
        this.id_ESTRUTURAPLANO = id_ESTRUTURAPLANO;
        return this;
    }
    /**
    * Obtém coD_ESTRUTURA
    * return coD_ESTRUTURA
    * @generated
    */
    
    public java.lang.String getCoD_ESTRUTURA(){
        return this.coD_ESTRUTURA;
    }

    /**
    * Define coD_ESTRUTURA
    * @param coD_ESTRUTURA coD_ESTRUTURA
    * @generated
    */
    public PCA_ESTRUTURAPLANO setCoD_ESTRUTURA(java.lang.String coD_ESTRUTURA){
        this.coD_ESTRUTURA = coD_ESTRUTURA;
        return this;
    }
    /**
    * Obtém deS_ESTRUTURA
    * return deS_ESTRUTURA
    * @generated
    */
    
    public java.lang.String getDeS_ESTRUTURA(){
        return this.deS_ESTRUTURA;
    }

    /**
    * Define deS_ESTRUTURA
    * @param deS_ESTRUTURA deS_ESTRUTURA
    * @generated
    */
    public PCA_ESTRUTURAPLANO setDeS_ESTRUTURA(java.lang.String deS_ESTRUTURA){
        this.deS_ESTRUTURA = deS_ESTRUTURA;
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
    public PCA_ESTRUTURAPLANO setDaT_LASTREC(java.util.Date daT_LASTREC){
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
    public PCA_ESTRUTURAPLANO setCoD_USUARIO(java.lang.String coD_USUARIO){
        this.coD_USUARIO = coD_USUARIO;
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
    public PCA_ESTRUTURAPLANO setId_ENTIDADE(ENTIDADE id_ENTIDADE){
        this.id_ENTIDADE = id_ENTIDADE;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
PCA_ESTRUTURAPLANO object = (PCA_ESTRUTURAPLANO)obj;
        if (id_ESTRUTURAPLANO != null ? !id_ESTRUTURAPLANO.equals(object.id_ESTRUTURAPLANO) : object.id_ESTRUTURAPLANO != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id_ESTRUTURAPLANO == null) ? 0 : id_ESTRUTURAPLANO.hashCode());
        return result;
    }

}