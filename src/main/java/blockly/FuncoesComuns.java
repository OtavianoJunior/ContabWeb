package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class FuncoesComuns {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// FuncoesComuns
public static Var ObterIdUsuarioLogado() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.database.Operations.getField(
cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u from User u where u.normalizedUserName = :normalizedUserName"),Var.valueOf("normalizedUserName",
cronapi.util.Operations.getCurrentUserName())),
Var.valueOf("this[0].normalizedUserName"));
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var ObterDataeHora() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.dateTime.Operations.getNow();
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var ObterEntidadeUsuario() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {

    item =
    cronapi.database.Operations.getField(
    cronapi.database.Operations.query(Var.valueOf("app.entity.USERACESSO"),Var.valueOf("select u from USERACESSO u where u.id_USER.normalizedUserName = :id_USERNormalizedUserName"),Var.valueOf("id_USERNormalizedUserName",
    cronapi.util.Operations.getCurrentUserName())),
    Var.valueOf("this[0].id_ENTIDADE.id_ENTIDADE"));

    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
    Var.valueOf(
    Var.valueOf("entidade = ").toString() +
    item.toString()));
    return
cronapi.database.Operations.getField(
cronapi.database.Operations.query(Var.valueOf("app.entity.USERACESSO"),Var.valueOf("select u from USERACESSO u where u.id_USER.normalizedUserName = :id_USERNormalizedUserName"),Var.valueOf("id_USERNormalizedUserName",
cronapi.util.Operations.getCurrentUserName())),
Var.valueOf("this[0].id_ENTIDADE.id_ENTIDADE"));
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var ObterEstruturaPlanoContas() throws Exception {
 return new Callable<Var>() {

   private Var idusuario = Var.VAR_NULL;
   private Var Ano = Var.VAR_NULL;
   private Var Entidade = Var.VAR_NULL;
   private Var estrutura = Var.VAR_NULL;

   public Var call() throws Exception {

    System.out.println(
    Var.valueOf(
    Var.valueOf("chama estrutura - ").toString() +
    cronapi.util.Operations.getCurrentUserName().toString()).getObjectAsString());

    idusuario =
    cronapi.database.Operations.getField(
    cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u from User u where u.normalizedUserName = :normalizedUserName"),Var.valueOf("normalizedUserName",
    cronapi.util.Operations.getCurrentUserName())),
    Var.valueOf("this[0].id"));

    System.out.println(
    Var.valueOf(
    Var.valueOf("retorna id usu - ").toString() +
    idusuario.toString()).getObjectAsString());

    Ano =
    cronapi.database.Operations.getField(
    cronapi.database.Operations.query(Var.valueOf("app.entity.USERACESSO"),Var.valueOf("select u from USERACESSO u where u.id_USER.id = :id_USERId"),Var.valueOf("id_USERId",idusuario)),
    Var.valueOf("this[0].nrO_ANOFISCAL"));

    System.out.println(
    Var.valueOf(
    Var.valueOf("retorna ano - ").toString() +
    Ano.toString()).getObjectAsString());

    Entidade =
    cronapi.database.Operations.getField(
    cronapi.database.Operations.query(Var.valueOf("app.entity.USERACESSO"),Var.valueOf("select u from USERACESSO u where u.id_USER.id = :id_USERId"),Var.valueOf("id_USERId",idusuario)),
    Var.valueOf("this[0].id_ENTIDADE.id_ENTIDADE"));

    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("warning"),
    Var.valueOf(
    Var.valueOf("retorna estrutura").toString() +
    Entidade.toString()));

    System.out.println(
    Var.valueOf(
    Var.valueOf("retorna esntidade - ").toString() +
    Entidade.toString()).getObjectAsString());

    estrutura =
    cronapi.database.Operations.getField(
    cronapi.database.Operations.query(Var.valueOf("app.entity.ANOFISCALENTIDADE"),Var.valueOf("select a from ANOFISCALENTIDADE a where a.id_ENTIDADE.id_ENTIDADE = :entidade AND a.nrO_ANOFISCAL = :ano"),Var.valueOf("entidade",Entidade),Var.valueOf("ano",Ano)),
    Var.valueOf("this[0].id_ESTRUTURAPLANO.id_ESTRUTURAPLANO"));

    System.out.println(
    Var.valueOf(
    Var.valueOf("retorna estrutura - ").toString() +
    estrutura.toString()).getObjectAsString());
    return estrutura;
   }
 }.call();
}

}

