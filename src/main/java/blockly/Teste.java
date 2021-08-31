package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Teste {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// teste
public static Var testando() throws Exception {
 return new Callable<Var>() {

   private Var Empenhar = Var.VAR_NULL;

   public Var call() throws Exception {

    Empenhar =
    cronapi.database.Operations.getField(
    Var.valueOf("EMPENHO"),
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("EMPENHO.active.id_EMPENHO")));
    return Empenhar;
   }
 }.call();
}

}

