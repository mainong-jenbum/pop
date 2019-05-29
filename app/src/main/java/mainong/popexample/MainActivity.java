package mainong.popexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ui.mainong.pop.Pop;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSuccess;
    private Button btnInfo;
    private Button btnWarn;
    private Button btnError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initPalettes();
        initClickListener();

    }

    /**
     * Initializes buttons
     */
    private void initPalettes() {
        btnSuccess = findViewById(R.id.btnSuccess);
        btnInfo = findViewById(R.id.btnInfo);
        btnWarn = findViewById(R.id.btnWarn);
        btnError = findViewById(R.id.btnError);
    }

    /**
     * Initializes OnClickListeners for buttons
     */
    private void initClickListener() {
        btnSuccess.setOnClickListener(this);
        btnInfo.setOnClickListener(this);
        btnWarn.setOnClickListener(this);
        btnError.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSuccess:
                Pop.success(this, getString(R.string.msg_success));
                break;

            case R.id.btnInfo:
                Pop.info(this, getString(R.string.msg_info));
                break;

            case R.id.btnWarn:
                Pop.warn(this, getString(R.string.mg_warn));
                break;

            case R.id.btnError:
                Pop.error(this, getString(R.string.msg_error));
                break;
        }
    }
}
