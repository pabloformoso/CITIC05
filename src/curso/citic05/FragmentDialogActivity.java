
package curso.citic05;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.widget.Toast;

import com.example.R;

import curso.citic05.EditNameDialog.EditNameDialogListener;

/**
 * 
 * @author pablo
 *
 */
public class FragmentDialogActivity extends FragmentActivity implements EditNameDialogListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        showEditDialog();
    }

    private void showEditDialog() {
       // TODO 1 Renderizar el Fragment
    }

    @Override
    public void onFinishEditDialog(String inputText) {
        Toast.makeText(this, "hola, " + inputText, Toast.LENGTH_LONG).show();
    }
    
    

}
