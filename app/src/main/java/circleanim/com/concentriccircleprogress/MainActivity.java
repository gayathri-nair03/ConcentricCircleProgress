package circleanim.com.concentriccircleprogress;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadCirclesFragment();
    }

    private void loadCirclesFragment() {
        replaceFragment(ContentFragment.newInstance());
    }

    public void replaceFragment(Fragment fragmentToBeLoaded) {
        if (!getSupportFragmentManager().isDestroyed()) {
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.mainFrameLayout, fragmentToBeLoaded,
                    "myfrag");
            fragmentTransaction.commitAllowingStateLoss();
        }
    }
}
