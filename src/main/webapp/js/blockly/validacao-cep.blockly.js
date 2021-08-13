window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.ValidacaoCep = window.blockly.js.blockly.ValidacaoCep || {};

/**
 * validacao-cep
 */
window.blockly.js.blockly.ValidacaoCep.Valida_cepArgs = [];
window.blockly.js.blockly.ValidacaoCep.Valida_cep = async function() {
 var retornoViaCep;
  this.cronapi.util.getURLFromOthers('GET', 'application/json', ['https://viacep.com.br/ws/',this.cronapi.screen.getValueOfField("ENTIDADE.active.nrO_CEP"),'/json/'].join(''), null, null, async function(sender_retornoViaCep) {
      retornoViaCep = sender_retornoViaCep;
    await this.cronapi.util.sleep(500);
    this.cronapi.screen.changeValueOfField("ENTIDADE.active.deS_LOGRADOURO", this.cronapi.object.getProperty(retornoViaCep, 'logradouro'));
    this.cronapi.screen.changeValueOfField("ENTIDADE.active.deS_BAIRRO", this.cronapi.object.getProperty(retornoViaCep, 'bairro'));
  }.bind(this), async function(sender_retornoViaCep) {
      retornoViaCep = sender_retornoViaCep;
    this.cronapi.screen.notify('warning','Não foi possível obter os dados do CEP - CEP Inválido. Digite novamente');
  }.bind(this));
  this.cronapi.screen.notify('success','');
}
