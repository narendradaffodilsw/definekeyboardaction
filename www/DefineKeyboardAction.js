var exec = require('cordova/exec');


var DefineAction = function() {
};
DefineAction.specifyActionButton = function(arg0, success, error) {
    exec(null, null, "DefineKeyboardAction", "specifyActionButton", [arg0]);
};

module.exports = DefineAction;
