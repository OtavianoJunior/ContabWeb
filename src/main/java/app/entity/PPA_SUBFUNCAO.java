package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PPA_SUBFUNCAO
* @generated
*/
@Entity
@Table(name = "\"PPA_SUBFUNCAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PPA_SUBFUNCAO")
public class PPA_SUBFUNCAO implements Serializable {

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
    @Column(name = "ID_SUBFUNCAO", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id_SUBFUNCAO;

    /**
    * @generated
    */
    @Column(name = "COD_SUBFUNCAO", nullable = true, unique = false, length=3, insertable=true, updatable=true)
        
        private java.lang.String coD_SUBFUNCAO;

    /**
    * @generated
    */
    @Column(name = "DES_SUBFUNCAO", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String deS_SUBFUNCAO;

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
    public PPA_SUBFUNCAO(){
    }

    /**
    * Obtém id_SUBFUNCAO
    * return id_SUBFUNCAO
    * @generated
    */
    
    public java.lang.Integer getId_SUBFUNCAO(){
        return this.id_SUBFUNCAO;
    }

    /**
    * Define id_SUBFUNCAO
    * @param id_SUBFUNCAO id_SUBFUNCAO
    * @generated
    */
    public PPA_SUBFUNCAO setId_SUBFUNCAO(java.lang.Integer id_SUBFUNCAO){
        this.id_SUBFUNCAO = id_SUBFUNCAO;
        return this;
    }
    /**
    * Obtém coD_SUBFUNCAO
    * return coD_SUBFUNCAO
    * @generated
    */
    
    public java.lang.String getCoD_SUBFUNCAO(){
        return this.coD_SUBFUNCAO;
    }

    /**
    * Define coD_SUBFUNCAO
    * @param coD_SUBFUNCAO coD_SUBFUNCAO
    * @generated
    */
    public PPA_SUBFUNCAO setCoD_SUBFUNCAO(java.lang.String coD_SUBFUNCAO){
        this.coD_SUBFUNCAO = coD_SUBFUNCAO;
        return this;
    }
    /**
    * Obtém deS_SUBFUNCAO
    * return deS_SUBFUNCAO
    * @generated
    */
    
    public java.lang.String getDeS_SUBFUNCAO(){
        return this.deS_SUBFUNCAO;
    }

    /**
    * Define deS_SUBFUNCAO
    * @param deS_SUBFUNCAO deS_SUBFUNCAO
    * @generated
    */
    public PPA_SUBFUNCAO setDeS_SUBFUNCAO(java.lang.String deS_SUBFUNCAO){
        this.deS_SUBFUNCAO = deS_SUBFUNCAO;
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
    public PPA_SUBFUNCAO setFlG_SAUDE(java.lang.String flG_SAUDE){
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
    public PPA_SUBFUNCAO setFlG_EDUCACAO(java.lang.String flG_EDUCACAO){
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
    public PPA_SUBFUNCAO setDaT_LASTREC(java.util.Date daT_LASTREC){
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
    public PPA_SUBFUNCAO setCoD_USUARIO(java.lang.String coD_USUARIO){
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
PPA_SUBFUNCAO object = (PPA_SUBFUNCAO)obj;
        if (id_SUBFUNCAO != null ? !id_SUBFUNCAO.equals(object.id_SUBFUNCAO) : object.id_SUBFUNCAO != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id_SUBFUNCAO == null) ? 0 : id_SUBFUNCAO.hashCode());
        return result;
    }

}