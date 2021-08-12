window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.ValidacaoCep = window.blockly.js.blockly.ValidacaoCep || {};

/**
 * validacao-cep
 */
window.blockly.js.blockly.ValidacaoCep.Valida_cepArgs = [];
window.blockly.js.blockly.ValidacaoCep.Valida_cep = async function() {
 var item;
  this.cronapi.util.getURLFromOthers('GET', 'application/json', ['https://viacep.com.br/ws/',this.cronapi.screen.getValueOfField("ENTIDADE.active.nrO_CEP"),'/json/'].join(''), null, null, async function(sender_item) {
      item = sender_item;
  }.bind(this), async function(sender_item) {
      item = sender_item;
  }.bind(this));
}
