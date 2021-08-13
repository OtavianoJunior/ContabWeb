package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class CNPJ {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// CNPJ
public static Var valida_cnpj() throws Exception {
 return new Callable<Var>() {

   private Var validador = Var.VAR_NULL;

   public Var call() throws Exception {

    validador =
    cronapi.validation.Operations.validateCNPJ(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("ENTIDADE.active.nrO_CGC")));

    if (
    Var.valueOf(validador.equals(
    Var.VAR_FALSE)).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("warning"),
        Var.valueOf("CNPJ Inválido!"));
    }
    return validador;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var Validar_Cadastro_CNPJ() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    if (
    Var.valueOf(
    Var.valueOf(valida_cnpj()).equals(
    Var.VAR_FALSE)).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("warning"),
        Var.valueOf("CNPJ INVÁLIDO!"));
    } else {

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.post"),
        Var.valueOf("ENTIDADE"));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

