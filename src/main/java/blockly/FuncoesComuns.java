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

   public Var call() throws Exception {
    return
cronapi.database.Operations.getField(
cronapi.database.Operations.query(Var.valueOf("app.entity.USERACESSO"),Var.valueOf("select u from USERACESSO u where u.id_USER.normalizedUserName = :id_USERNormalizedUserName"),Var.valueOf("id_USERNormalizedUserName",
cronapi.util.Operations.getCurrentUserName())),
Var.valueOf("this[0].id_ENTIDADE.id_ENTIDADE"));
   }
 }.call();
}

}

