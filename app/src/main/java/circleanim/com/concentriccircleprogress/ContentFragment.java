package circleanim.com.concentriccircleprogress;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/**
 * Created by gayathri_nair on 29/01/16.
 */
public class ContentFragment extends Fragment {

    private View rootView;

    public static ContentFragment newInstance() {
        return new ContentFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.content_main, container, false);
        initViews();
        return rootView;
    }

    private void initViews() {
        final View c1 = rootView.findViewById(R.id.soundRipple2);
        final View c2 = rootView.findViewById(R.id.soundRipple3);
        final Animation pulse = AnimationUtils.loadAnimation(getActivity(), R.anim.alpha_scale_set);
        final Animation pulse2 = AnimationUtils.loadAnimation(getActivity(), R.anim.alpha_scale_set);

        c1.startAnimation(pulse);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                c2.startAnimation(pulse2);
            }
        }, 100);


    }

}
