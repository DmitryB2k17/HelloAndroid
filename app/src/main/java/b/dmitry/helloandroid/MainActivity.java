package b.dmitry.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openurl(View view) {
      Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udacity.com"));
        if (browserIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(browserIntent);
        }
    }
}
