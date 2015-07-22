package com.meroweather.meroweather.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.meroweather.meroweather.R;

/**
 * Created by lenevo on 7/22/2015.
 */
public class DetailFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v;
        v = inflater.inflate(R.layout.fragment_detail, container, false);
        // The detail Activity called via intent.  Inspect the intent for forecast data.
        Intent intent = getActivity().getIntent();
        if (intent != null && intent.hasExtra(Intent.EXTRA_TEXT)) {
            String forecastString = intent.getStringExtra(Intent.EXTRA_TEXT);
            ((TextView) v.findViewById(R.id.textView_detail_fragment)).setText(forecastString);
        }

        return v;

    }
}
