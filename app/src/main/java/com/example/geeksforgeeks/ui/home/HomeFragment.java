package com.example.geeksforgeeks.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.geeksforgeeks.R;
import com.example.geeksforgeeks.WebViewController;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        WebView webView=root.findViewById(R.id.web_view_home);
        webView.loadUrl("https://campmigdal.zenfolio.com/recent.html");
        webView.setWebViewClient(new WebViewController());
        webView.getSettings().setJavaScriptEnabled(true); webView.getSettings().setLoadWithOverviewMode(true); webView.getSettings().setUseWideViewPort(true); webView.getSettings().setSupportZoom(true); webView.getSettings().setBuiltInZoomControls(true); webView.getSettings().setDisplayZoomControls(false); webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY); webView.setScrollbarFadingEnabled(false);
        return root;
    }
}