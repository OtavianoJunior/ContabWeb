package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PPA_ACAO
* @generated
*/
@Entity
@Table(name = "\"PPA_ACAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PPA_ACAO")
public class PPA_ACAO implements Serializable {

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
    @Column(name = "ID_ACAO", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id_ACAO;

    /**
    * @generated
    */
    @Column(name = "COD_ACAO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer coD_ACAO;

    /**
    * @generated
    */
    @Column(name = "DES_ACAO", nullable = true, unique = false, length=100, insertable=true, updatable=true, columnDefinition = "TEXT")
        
        private java.lang.String deS_ACAO;

    /**
    * @generated
    */
    @Column(name = "DES_ACAORESUMIDA", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String deS_ACAORESUMIDA;

    /**
    * @generated
    */
    @Column(name = "IDT_TIPOACAO", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String idT_TIPOACAO;

    /**
    * @generated
    */
    @Column(name = "DES_PRODUTO", nullable = true, unique = false, length=100, insertable=true, updatable=true, columnDefinition = "TEXT")
        
        private java.lang.String deS_PRODUTO;

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
    @JoinColumn(name="ID_ANOFISCAL", nullable = true, referencedColumnName = "ID_ANOFISCAL", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private ANOFISCALENTIDADE id_ANOFISCAL;

    /**
    * Construtor
    * @generated
    */
    public PPA_ACAO(){
    }

    /**
    * Obtém id_ACAO
    * return id_ACAO
    * @generated
    */
    
    public java.lang.Integer getId_ACAO(){
        return this.id_ACAO;
    }

    /**
    * Define id_ACAO
    * @param id_ACAO id_ACAO
    * @generated
    */
    public PPA_ACAO setId_ACAO(java.lang.Integer id_ACAO){
        this.id_ACAO = id_ACAO;
        return this;
    }
    /**
    * Obtém coD_ACAO
    * return coD_ACAO
    * @generated
    */
    
    public java.lang.Integer getCoD_ACAO(){
        return this.coD_ACAO;
    }

    /**
    * Define coD_ACAO
    * @param coD_ACAO coD_ACAO
    * @generated
    */
    public PPA_ACAO setCoD_ACAO(java.lang.Integer coD_ACAO){
        this.coD_ACAO = coD_ACAO;
        return this;
    }
    /**
    * Obtém deS_ACAO
    * return deS_ACAO
    * @generated
    */
    
    public java.lang.String getDeS_ACAO(){
        return this.deS_ACAO;
    }

    /**
    * Define deS_ACAO
    * @param deS_ACAO deS_ACAO
    * @generated
    */
    public PPA_ACAO setDeS_ACAO(java.lang.String deS_ACAO){
        this.deS_ACAO = deS_ACAO;
        return this;
    }
    /**
    * Obtém deS_ACAORESUMIDA
    * return deS_ACAORESUMIDA
    * @generated
    */
    
    public java.lang.String getDeS_ACAORESUMIDA(){
        return this.deS_ACAORESUMIDA;
    }

    /**
    * Define deS_ACAORESUMIDA
    * @param deS_ACAORESUMIDA deS_ACAORESUMIDA
    * @generated
    */
    public PPA_ACAO setDeS_ACAORESUMIDA(java.lang.String deS_ACAORESUMIDA){
        this.deS_ACAORESUMIDA = deS_ACAORESUMIDA;
        return this;
    }
    /**
    * Obtém idT_TIPOACAO
    * return idT_TIPOACAO
    * @generated
    */
    
    public java.lang.String getIdT_TIPOACAO(){
        return this.idT_TIPOACAO;
    }

    /**
    * Define idT_TIPOACAO
    * @param idT_TIPOACAO idT_TIPOACAO
    * @generated
    */
    public PPA_ACAO setIdT_TIPOACAO(java.lang.String idT_TIPOACAO){
        this.idT_TIPOACAO = idT_TIPOACAO;
        return this;
    }
    /**
    * Obtém deS_PRODUTO
    * return deS_PRODUTO
    * @generated
    */
    
    public java.lang.String getDeS_PRODUTO(){
        return this.deS_PRODUTO;
    }

    /**
    * Define deS_PRODUTO
    * @param deS_PRODUTO deS_PRODUTO
    * @generated
    */
    public PPA_ACAO setDeS_PRODUTO(java.lang.String deS_PRODUTO){
        this.deS_PRODUTO = deS_PRODUTO;
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
    public PPA_ACAO setDaT_LASTREC(java.util.Date daT_LASTREC){
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
    public PPA_ACAO setCoD_USUARIO(java.lang.String coD_USUARIO){
        this.coD_USUARIO = coD_USUARIO;
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
    public PPA_ACAO setId_ANOFISCAL(ANOFISCALENTIDADE id_ANOFISCAL){
        this.id_ANOFISCAL = id_ANOFISCAL;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
PPA_ACAO object = (PPA_ACAO)obj;
        if (id_ACAO != null ? !id_ACAO.equals(object.id_ACAO) : object.id_ACAO != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id_ACAO == null) ? 0 : id_ACAO.hashCode());
        return result;
    }

}