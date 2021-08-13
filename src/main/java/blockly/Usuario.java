package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Usuario {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Usuario
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
// Usuario
public static Var ValidarCPF() throws Exception {
 return new Callable<Var>() {

   private Var validador = Var.VAR_NULL;

   public Var call() throws Exception {

    validador =
    cronapi.validation.Operations.validateCPF(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("ORGAOSICOM.active.coD_CPFGESTOR")));

    if (
    Var.valueOf(validador.equals(
    Var.VAR_FALSE)).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("CPF Inválido"));
    }
    return validador;
   }
 }.call();
}

/**
 */
// Descreva esta função...
public static void ValidarCadastroOrg_C3_A3o() throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {

    if (
    Var.valueOf(
    Var.valueOf(ValidarCPF()).equals(
    Var.VAR_FALSE)).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("CPF Inválido"));
    } else {

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.post"),
        Var.valueOf("ORGAOSICOM"));
    }
   return Var.VAR_NULL;
   }
 }.call();
}

}

