window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.DataLatrec = window.blockly.js.blockly.DataLatrec || {};

/**
 * DataLatrec
 */
window.blockly.js.blockly.DataLatrec.Data_LastrecArgs = [];
window.blockly.js.blockly.DataLatrec.Data_Lastrec = async function() {
 var HoraData;
  HoraData = this.cronapi.dateTime.formatDateTime(this.cronapi.dateTime.getNow(), '');
  return HoraData;
}
