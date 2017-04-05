package cordova-plugin-define-keyboard-action;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import android.widget.TextView;
import android.view.inputmethod.EditorInfo
import android.context.Context;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class DefineKeyboardAction extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("specifyActionButton")) {
            String message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        }
        return false;
    }

    private void specifyActionButton(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            TextView.setImeOptions(EditorInfo.IME_ACTION_NEXT);
            callbackContext.success("plugin is working");
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}
