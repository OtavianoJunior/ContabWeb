package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Credor {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Credor
public static Var Validar_TipoFornecedor() throws Exception {
 return new Callable<Var>() {

   private Var credor_validacao = Var.VAR_NULL;
   private Var Verificar_codigo = Var.VAR_NULL;

   public Var call() throws Exception {

    if (
    Var.valueOf(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.tipoFornecedor")).equals(
    Var.valueOf(1))).getObjectAsBoolean()) {

        credor_validacao =
        cronapi.validation.Operations.validateCNPJ(
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("CUC.active.nrO_CGC")));

        if (
        Var.valueOf(credor_validacao.equals(
        Var.VAR_FALSE)).getObjectAsBoolean()) {

            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
            Var.valueOf("CNPJ Inválido"));

            cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.focusComponent"),
            Var.valueOf("CUC.active.nrO_CGC"));

            Verificar_codigo =
            Var.VAR_FALSE;
        } else {

            Verificar_codigo =
            Var.VAR_TRUE;
        }
    } else if (
    Var.valueOf(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.tipoFornecedor")).equals(
    Var.valueOf(2))).getObjectAsBoolean()) {

        credor_validacao =
        cronapi.validation.Operations.validateCPF(
        cronapi.screen.Operations.getValueOfField(
        Var.valueOf("CUC.active.nrO_CGC")));

        if (
        Var.valueOf(credor_validacao.equals(
        Var.VAR_FALSE)).getObjectAsBoolean()) {

            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
            Var.valueOf("CPF Inválido"));

            cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.focusComponent"),
            Var.valueOf("CUC.active.nrO_CGC"));

            Verificar_codigo =
            Var.VAR_FALSE;
        } else {

            Verificar_codigo =
            Var.VAR_TRUE;
        }
    } else {
      {}
    }
    return Verificar_codigo;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var Alterar_valorDoCampoCod() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    if (
    Var.valueOf(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.tipoFornecedor")).equals(
    Var.valueOf(1))).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
        Var.valueOf("CUC.active.nrO_CGC"),
        cronapi.conversion.Operations.formatDouble(
        Var.valueOf("CUC.active.nrO_CGC"),
        Var.valueOf("99.999.999/9999-99;0")));
    } else if (Var.VAR_FALSE.getObjectAsBoolean()) {
      {}
    }
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var Validar_TipoCredor() throws Exception {
 return new Callable<Var>() {

   private Var validado = Var.VAR_NULL;

   public Var call() throws Exception {

    if (
    Var.valueOf(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.tipoFornecedor")).compareTo(
    Var.valueOf(3)) > 0).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("Tipo Credor Inválido"));

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.focusComponent"),
        Var.valueOf("crn-textinput-TipoFornecedor-885068"));

        validado =
        Var.VAR_FALSE;
    } else {

        validado =
        Var.VAR_TRUE;
    }
    return validado;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var Verificar_TipoValidado() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    if (
    Var.valueOf((
    Var.valueOf(
    Var.valueOf(Validar_TipoCredor()).getObjectAsBoolean() &&
    Var.valueOf(Validar_TipoFornecedor()).getObjectAsBoolean())).equals(
    Var.VAR_TRUE)).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.post"),
        Var.valueOf("CUC"));
    } else {

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("Dados Inválidos"));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

