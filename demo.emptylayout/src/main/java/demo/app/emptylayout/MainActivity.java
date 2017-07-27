package demo.app.emptylayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import lib.ui.empty.DefaultEmptyLayout;
import lib.ui.empty.IEmptyLayout;


public class MainActivity extends AppCompatActivity {

    private TextView textHello;
    private DefaultEmptyLayout emptyLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textHello = (TextView) findViewById(R.id.textHello);

        emptyLayout = (DefaultEmptyLayout) findViewById(R.id.emptyLayout);

        findViewById(R.id.btnLoading).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emptyLayout.setEmptyType(IEmptyLayout.Type.Loading);
            }
        });
        findViewById(R.id.btnEmpty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emptyLayout.setEmptyType(IEmptyLayout.Type.Empty);
            }
        });
        findViewById(R.id.btnError).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emptyLayout.setEmptyType(IEmptyLayout.Type.Error);
            }
        });
        findViewById(R.id.btnData).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emptyLayout.setEmptyType(IEmptyLayout.Type.Data);
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

}
