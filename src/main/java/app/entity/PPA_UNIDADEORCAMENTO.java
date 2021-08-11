package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PPA_UNIDADEORCAMENTO
* @generated
*/
@Entity
@Table(name = "\"PPA_UNIDADEORCAMENTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PPA_UNIDADEORCAMENTO")
public class PPA_UNIDADEORCAMENTO implements Serializable {

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
    @Column(name = "ID_UNIDORC", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id_UNIDORC;

    /**
    * @generated
    */
    @Column(name = "COD_UNIDORC", nullable = true, unique = false, length=8, insertable=true, updatable=true)
        
        private java.lang.String coD_UNIDORC;

    /**
    * @generated
    */
    @Column(name = "DES_UNIDADEORC", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String deS_UNIDADEORC;

    /**
    * @generated
    */
    @Column(name = "FLG_SINTETICA", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String flG_SINTETICA;

    /**
    * @generated
    */
    @Column(name = "COD_UNIDORCSEMMASCARA", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String coD_UNIDORCSEMMASCARA;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_CRIACAO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date daT_CRIACAO;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_EXTINCAO", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date daT_EXTINCAO;

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
    @JoinColumn(name="ID_UNIDORCSUP", nullable = true, referencedColumnName = "ID_UNIDORC", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private PPA_UNIDADEORCAMENTO id_UNIDORCSUP;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ID_ORGAOSICOM", nullable = true, referencedColumnName = "ID_ORGAOSICOM", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private ORGAOSICOM id_ORGAOSICOM;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ID_ANOFISCALENTIDADE", nullable = true, referencedColumnName = "ID_ANOFISCAL", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private ANOFISCALENTIDADE id_ANOFISCALENTIDADE;

    /**
    * Construtor
    * @generated
    */
    public PPA_UNIDADEORCAMENTO(){
    }

    /**
    * Obtém id_UNIDORC
    * return id_UNIDORC
    * @generated
    */
    
    public java.lang.Integer getId_UNIDORC(){
        return this.id_UNIDORC;
    }

    /**
    * Define id_UNIDORC
    * @param id_UNIDORC id_UNIDORC
    * @generated
    */
    public PPA_UNIDADEORCAMENTO setId_UNIDORC(java.lang.Integer id_UNIDORC){
        this.id_UNIDORC = id_UNIDORC;
        return this;
    }
    /**
    * Obtém coD_UNIDORC
    * return coD_UNIDORC
    * @generated
    */
    
    public java.lang.String getCoD_UNIDORC(){
        return this.coD_UNIDORC;
    }

    /**
    * Define coD_UNIDORC
    * @param coD_UNIDORC coD_UNIDORC
    * @generated
    */
    public PPA_UNIDADEORCAMENTO setCoD_UNIDORC(java.lang.String coD_UNIDORC){
        this.coD_UNIDORC = coD_UNIDORC;
        return this;
    }
    /**
    * Obtém deS_UNIDADEORC
    * return deS_UNIDADEORC
    * @generated
    */
    
    public java.lang.String getDeS_UNIDADEORC(){
        return this.deS_UNIDADEORC;
    }

    /**
    * Define deS_UNIDADEORC
    * @param deS_UNIDADEORC deS_UNIDADEORC
    * @generated
    */
    public PPA_UNIDADEORCAMENTO setDeS_UNIDADEORC(java.lang.String deS_UNIDADEORC){
        this.deS_UNIDADEORC = deS_UNIDADEORC;
        return this;
    }
    /**
    * Obtém flG_SINTETICA
    * return flG_SINTETICA
    * @generated
    */
    
    public java.lang.String getFlG_SINTETICA(){
        return this.flG_SINTETICA;
    }

    /**
    * Define flG_SINTETICA
    * @param flG_SINTETICA flG_SINTETICA
    * @generated
    */
    public PPA_UNIDADEORCAMENTO setFlG_SINTETICA(java.lang.String flG_SINTETICA){
        this.flG_SINTETICA = flG_SINTETICA;
        return this;
    }
    /**
    * Obtém coD_UNIDORCSEMMASCARA
    * return coD_UNIDORCSEMMASCARA
    * @generated
    */
    
    public java.lang.String getCoD_UNIDORCSEMMASCARA(){
        return this.coD_UNIDORCSEMMASCARA;
    }

    /**
    * Define coD_UNIDORCSEMMASCARA
    * @param coD_UNIDORCSEMMASCARA coD_UNIDORCSEMMASCARA
    * @generated
    */
    public PPA_UNIDADEORCAMENTO setCoD_UNIDORCSEMMASCARA(java.lang.String coD_UNIDORCSEMMASCARA){
        this.coD_UNIDORCSEMMASCARA = coD_UNIDORCSEMMASCARA;
        return this;
    }
    /**
    * Obtém daT_CRIACAO
    * return daT_CRIACAO
    * @generated
    */
    
    public java.util.Date getDaT_CRIACAO(){
        return this.daT_CRIACAO;
    }

    /**
    * Define daT_CRIACAO
    * @param daT_CRIACAO daT_CRIACAO
    * @generated
    */
    public PPA_UNIDADEORCAMENTO setDaT_CRIACAO(java.util.Date daT_CRIACAO){
        this.daT_CRIACAO = daT_CRIACAO;
        return this;
    }
    /**
    * Obtém daT_EXTINCAO
    * return daT_EXTINCAO
    * @generated
    */
    
    public java.util.Date getDaT_EXTINCAO(){
        return this.daT_EXTINCAO;
    }

    /**
    * Define daT_EXTINCAO
    * @param daT_EXTINCAO daT_EXTINCAO
    * @generated
    */
    public PPA_UNIDADEORCAMENTO setDaT_EXTINCAO(java.util.Date daT_EXTINCAO){
        this.daT_EXTINCAO = daT_EXTINCAO;
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
    public PPA_UNIDADEORCAMENTO setDaT_LASTREC(java.util.Date daT_LASTREC){
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
    public PPA_UNIDADEORCAMENTO setCoD_USUARIO(java.lang.String coD_USUARIO){
        this.coD_USUARIO = coD_USUARIO;
        return this;
    }
    /**
    * Obtém id_UNIDORCSUP
    * return id_UNIDORCSUP
    * @generated
    */
    
    public PPA_UNIDADEORCAMENTO getId_UNIDORCSUP(){
        return this.id_UNIDORCSUP;
    }

    /**
    * Define id_UNIDORCSUP
    * @param id_UNIDORCSUP id_UNIDORCSUP
    * @generated
    */
    public PPA_UNIDADEORCAMENTO setId_UNIDORCSUP(PPA_UNIDADEORCAMENTO id_UNIDORCSUP){
        this.id_UNIDORCSUP = id_UNIDORCSUP;
        return this;
    }
    /**
    * Obtém id_ORGAOSICOM
    * return id_ORGAOSICOM
    * @generated
    */
    
    public ORGAOSICOM getId_ORGAOSICOM(){
        return this.id_ORGAOSICOM;
    }

    /**
    * Define id_ORGAOSICOM
    * @param id_ORGAOSICOM id_ORGAOSICOM
    * @generated
    */
    public PPA_UNIDADEORCAMENTO setId_ORGAOSICOM(ORGAOSICOM id_ORGAOSICOM){
        this.id_ORGAOSICOM = id_ORGAOSICOM;
        return this;
    }
    /**
    * Obtém id_ANOFISCALENTIDADE
    * return id_ANOFISCALENTIDADE
    * @generated
    */
    
    public ANOFISCALENTIDADE getId_ANOFISCALENTIDADE(){
        return this.id_ANOFISCALENTIDADE;
    }

    /**
    * Define id_ANOFISCALENTIDADE
    * @param id_ANOFISCALENTIDADE id_ANOFISCALENTIDADE
    * @generated
    */
    public PPA_UNIDADEORCAMENTO setId_ANOFISCALENTIDADE(ANOFISCALENTIDADE id_ANOFISCALENTIDADE){
        this.id_ANOFISCALENTIDADE = id_ANOFISCALENTIDADE;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
PPA_UNIDADEORCAMENTO object = (PPA_UNIDADEORCAMENTO)obj;
        if (id_UNIDORC != null ? !id_UNIDORC.equals(object.id_UNIDORC) : object.id_UNIDORC != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id_UNIDORC == null) ? 0 : id_UNIDORC.hashCode());
        return result;
    }

}