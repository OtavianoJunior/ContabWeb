package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PPA_FUNCAO
* @generated
*/
@Entity
@Table(name = "\"PPA_FUNCAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PPA_FUNCAO")
public class PPA_FUNCAO implements Serializable {

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
    @Column(name = "ID_FUNCAO", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id_FUNCAO;

    /**
    * @generated
    */
    @Column(name = "COD_FUNCAO", nullable = true, unique = false, length=2, insertable=true, updatable=true)
        
        private java.lang.String coD_FUNCAO;

    /**
    * @generated
    */
    @Column(name = "DES_FUNCAO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String deS_FUNCAO;

    /**
    * @generated
    */
    @Column(name = "FLG_SAUDE", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String flG_SAUDE;

    /**
    * @generated
    */
    @Column(name = "FLG_EDUCACAO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String flG_EDUCACAO;

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
    public PPA_FUNCAO(){
    }

    /**
    * Obtém id_FUNCAO
    * return id_FUNCAO
    * @generated
    */
    
    public java.lang.Integer getId_FUNCAO(){
        return this.id_FUNCAO;
    }

    /**
    * Define id_FUNCAO
    * @param id_FUNCAO id_FUNCAO
    * @generated
    */
    public PPA_FUNCAO setId_FUNCAO(java.lang.Integer id_FUNCAO){
        this.id_FUNCAO = id_FUNCAO;
        return this;
    }
    /**
    * Obtém coD_FUNCAO
    * return coD_FUNCAO
    * @generated
    */
    
    public java.lang.String getCoD_FUNCAO(){
        return this.coD_FUNCAO;
    }

    /**
    * Define coD_FUNCAO
    * @param coD_FUNCAO coD_FUNCAO
    * @generated
    */
    public PPA_FUNCAO setCoD_FUNCAO(java.lang.String coD_FUNCAO){
        this.coD_FUNCAO = coD_FUNCAO;
        return this;
    }
    /**
    * Obtém deS_FUNCAO
    * return deS_FUNCAO
    * @generated
    */
    
    public java.lang.String getDeS_FUNCAO(){
        return this.deS_FUNCAO;
    }

    /**
    * Define deS_FUNCAO
    * @param deS_FUNCAO deS_FUNCAO
    * @generated
    */
    public PPA_FUNCAO setDeS_FUNCAO(java.lang.String deS_FUNCAO){
        this.deS_FUNCAO = deS_FUNCAO;
        return this;
    }
    /**
    * Obtém flG_SAUDE
    * return flG_SAUDE
    * @generated
    */
    
    public java.lang.String getFlG_SAUDE(){
        return this.flG_SAUDE;
    }

    /**
    * Define flG_SAUDE
    * @param flG_SAUDE flG_SAUDE
    * @generated
    */
    public PPA_FUNCAO setFlG_SAUDE(java.lang.String flG_SAUDE){
        this.flG_SAUDE = flG_SAUDE;
        return this;
    }
    /**
    * Obtém flG_EDUCACAO
    * return flG_EDUCACAO
    * @generated
    */
    
    public java.lang.String getFlG_EDUCACAO(){
        return this.flG_EDUCACAO;
    }

    /**
    * Define flG_EDUCACAO
    * @param flG_EDUCACAO flG_EDUCACAO
    * @generated
    */
    public PPA_FUNCAO setFlG_EDUCACAO(java.lang.String flG_EDUCACAO){
        this.flG_EDUCACAO = flG_EDUCACAO;
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
    public PPA_FUNCAO setDaT_LASTREC(java.util.Date daT_LASTREC){
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
    public PPA_FUNCAO setCoD_USUARIO(java.lang.String coD_USUARIO){
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
PPA_FUNCAO object = (PPA_FUNCAO)obj;
        if (id_FUNCAO != null ? !id_FUNCAO.equals(object.id_FUNCAO) : object.id_FUNCAO != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id_FUNCAO == null) ? 0 : id_FUNCAO.hashCode());
        return result;
    }

}