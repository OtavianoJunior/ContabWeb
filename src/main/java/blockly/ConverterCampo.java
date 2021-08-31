package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ConverterCampo {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Converter Campo
public static Var Converter_Campo_Nro_anofiscal() throws Exception {
 return new Callable<Var>() {

   private Var converter = Var.VAR_NULL;

   public Var call() throws Exception {

    converter =
    Var.valueOf(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("ANOFISCALENTIDADE.active.nrO_ANOFISCAL")).equals(
    cronapi.conversion.Operations.convert(
    Var.valueOf("INTEGER"),
    Var.valueOf("STRING"))));
    return converter;
   }
 }.call();
}

}

