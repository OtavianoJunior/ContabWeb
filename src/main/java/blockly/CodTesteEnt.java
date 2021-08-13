package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class CodTesteEnt {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Cod.Entidade
public static Var gera_cod_entidade() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {

    item =
    Var.valueOf(item.equals(
    Var.valueOf(0)));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeAttrValue"),
    Var.valueOf("textinput-coD_ENTIDADE"),
    Var.valueOf("Código Entidade"),
    cronapi.math.Operations.sum(item,
    Var.valueOf(1)));
    return Var.VAR_NULL;
   }
 }.call();
}

}

