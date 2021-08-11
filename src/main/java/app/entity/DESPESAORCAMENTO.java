package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela DESPESAORCAMENTO
* @generated
*/
@Entity
@Table(name = "\"DESPESAORCAMENTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.DESPESAORCAMENTO")
public class DESPESAORCAMENTO implements Serializable {

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
    @Column(name = "SEQ_DESPESAORCAMENTO", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer seQ_DESPESAORCAMENTO;

    /**
    * @generated
    */
    @Column(name = "COD_FICHA", nullable = true, unique = false, length=10, insertable=true, updatable=true)
        
        private java.lang.String coD_FICHA;

    /**
    * @generated
    */
    @Column(name = "VLR_FIXADO", nullable = true, unique = false, length=18, precision=2, insertable=true, updatable=true)
        
        private java.lang.Double vlR_FIXADO;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAT_LASREC", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date daT_LASREC;

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
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ID_UNIDORC", nullable = true, referencedColumnName = "ID_UNIDORC", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private PPA_UNIDADEORCAMENTO id_UNIDORC;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ID_FUNCAO", nullable = true, referencedColumnName = "ID_FUNCAO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private PPA_FUNCAO id_FUNCAO;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ID_SUBFUNCAO", nullable = true, referencedColumnName = "ID_SUBFUNCAO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private PPA_SUBFUNCAO id_SUBFUNCAO;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ID_PROGRAMA", nullable = true, referencedColumnName = "ID_PROGRAMA", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private PPA_PROGRAMA id_PROGRAMA;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ID_ACAO", nullable = true, referencedColumnName = "ID_ACAO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private PPA_ACAO id_ACAO;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ID_DESPESA", nullable = true, referencedColumnName = "ID_DESPESACLASSIFICACAO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private DESPESACLASSIFICACAO id_DESPESA;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="ID_FONTERECURSO", nullable = true, referencedColumnName = "ID_FONTERECURSO", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private FONTERECURSO id_FONTERECURSO;

    /**
    * Construtor
    * @generated
    */
    public DESPESAORCAMENTO(){
    }

    /**
    * Obtém seQ_DESPESAORCAMENTO
    * return seQ_DESPESAORCAMENTO
    * @generated
    */
    
    public java.lang.Integer getSeQ_DESPESAORCAMENTO(){
        return this.seQ_DESPESAORCAMENTO;
    }

    /**
    * Define seQ_DESPESAORCAMENTO
    * @param seQ_DESPESAORCAMENTO seQ_DESPESAORCAMENTO
    * @generated
    */
    public DESPESAORCAMENTO setSeQ_DESPESAORCAMENTO(java.lang.Integer seQ_DESPESAORCAMENTO){
        this.seQ_DESPESAORCAMENTO = seQ_DESPESAORCAMENTO;
        return this;
    }
    /**
    * Obtém coD_FICHA
    * return coD_FICHA
    * @generated
    */
    
    public java.lang.String getCoD_FICHA(){
        return this.coD_FICHA;
    }

    /**
    * Define coD_FICHA
    * @param coD_FICHA coD_FICHA
    * @generated
    */
    public DESPESAORCAMENTO setCoD_FICHA(java.lang.String coD_FICHA){
        this.coD_FICHA = coD_FICHA;
        return this;
    }
    /**
    * Obtém vlR_FIXADO
    * return vlR_FIXADO
    * @generated
    */
    
    public java.lang.Double getVlR_FIXADO(){
        return this.vlR_FIXADO;
    }

    /**
    * Define vlR_FIXADO
    * @param vlR_FIXADO vlR_FIXADO
    * @generated
    */
    public DESPESAORCAMENTO setVlR_FIXADO(java.lang.Double vlR_FIXADO){
        this.vlR_FIXADO = vlR_FIXADO;
        return this;
    }
    /**
    * Obtém daT_LASREC
    * return daT_LASREC
    * @generated
    */
    
    public java.util.Date getDaT_LASREC(){
        return this.daT_LASREC;
    }

    /**
    * Define daT_LASREC
    * @param daT_LASREC daT_LASREC
    * @generated
    */
    public DESPESAORCAMENTO setDaT_LASREC(java.util.Date daT_LASREC){
        this.daT_LASREC = daT_LASREC;
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
    public DESPESAORCAMENTO setCoD_USUARIO(java.lang.String coD_USUARIO){
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
    public DESPESAORCAMENTO setId_ANOFISCAL(ANOFISCALENTIDADE id_ANOFISCAL){
        this.id_ANOFISCAL = id_ANOFISCAL;
        return this;
    }
    /**
    * Obtém id_UNIDORC
    * return id_UNIDORC
    * @generated
    */
    
    public PPA_UNIDADEORCAMENTO getId_UNIDORC(){
        return this.id_UNIDORC;
    }

    /**
    * Define id_UNIDORC
    * @param id_UNIDORC id_UNIDORC
    * @generated
    */
    public DESPESAORCAMENTO setId_UNIDORC(PPA_UNIDADEORCAMENTO id_UNIDORC){
        this.id_UNIDORC = id_UNIDORC;
        return this;
    }
    /**
    * Obtém id_FUNCAO
    * return id_FUNCAO
    * @generated
    */
    
    public PPA_FUNCAO getId_FUNCAO(){
        return this.id_FUNCAO;
    }

    /**
    * Define id_FUNCAO
    * @param id_FUNCAO id_FUNCAO
    * @generated
    */
    public DESPESAORCAMENTO setId_FUNCAO(PPA_FUNCAO id_FUNCAO){
        this.id_FUNCAO = id_FUNCAO;
        return this;
    }
    /**
    * Obtém id_SUBFUNCAO
    * return id_SUBFUNCAO
    * @generated
    */
    
    public PPA_SUBFUNCAO getId_SUBFUNCAO(){
        return this.id_SUBFUNCAO;
    }

    /**
    * Define id_SUBFUNCAO
    * @param id_SUBFUNCAO id_SUBFUNCAO
    * @generated
    */
    public DESPESAORCAMENTO setId_SUBFUNCAO(PPA_SUBFUNCAO id_SUBFUNCAO){
        this.id_SUBFUNCAO = id_SUBFUNCAO;
        return this;
    }
    /**
    * Obtém id_PROGRAMA
    * return id_PROGRAMA
    * @generated
    */
    
    public PPA_PROGRAMA getId_PROGRAMA(){
        return this.id_PROGRAMA;
    }

    /**
    * Define id_PROGRAMA
    * @param id_PROGRAMA id_PROGRAMA
    * @generated
    */
    public DESPESAORCAMENTO setId_PROGRAMA(PPA_PROGRAMA id_PROGRAMA){
        this.id_PROGRAMA = id_PROGRAMA;
        return this;
    }
    /**
    * Obtém id_ACAO
    * return id_ACAO
    * @generated
    */
    
    public PPA_ACAO getId_ACAO(){
        return this.id_ACAO;
    }

    /**
    * Define id_ACAO
    * @param id_ACAO id_ACAO
    * @generated
    */
    public DESPESAORCAMENTO setId_ACAO(PPA_ACAO id_ACAO){
        this.id_ACAO = id_ACAO;
        return this;
    }
    /**
    * Obtém id_DESPESA
    * return id_DESPESA
    * @generated
    */
    
    public DESPESACLASSIFICACAO getId_DESPESA(){
        return this.id_DESPESA;
    }

    /**
    * Define id_DESPESA
    * @param id_DESPESA id_DESPESA
    * @generated
    */
    public DESPESAORCAMENTO setId_DESPESA(DESPESACLASSIFICACAO id_DESPESA){
        this.id_DESPESA = id_DESPESA;
        return this;
    }
    /**
    * Obtém id_FONTERECURSO
    * return id_FONTERECURSO
    * @generated
    */
    
    public FONTERECURSO getId_FONTERECURSO(){
        return this.id_FONTERECURSO;
    }

    /**
    * Define id_FONTERECURSO
    * @param id_FONTERECURSO id_FONTERECURSO
    * @generated
    */
    public DESPESAORCAMENTO setId_FONTERECURSO(FONTERECURSO id_FONTERECURSO){
        this.id_FONTERECURSO = id_FONTERECURSO;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
DESPESAORCAMENTO object = (DESPESAORCAMENTO)obj;
        if (seQ_DESPESAORCAMENTO != null ? !seQ_DESPESAORCAMENTO.equals(object.seQ_DESPESAORCAMENTO) : object.seQ_DESPESAORCAMENTO != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((seQ_DESPESAORCAMENTO == null) ? 0 : seQ_DESPESAORCAMENTO.hashCode());
        return result;
    }

}