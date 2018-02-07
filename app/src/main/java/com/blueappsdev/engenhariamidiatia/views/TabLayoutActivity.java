package com.blueappsdev.engenhariamidiatia.views;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;

import com.blueappsdev.engenhariamidiatia.R;

import org.androidannotations.annotations.AfterExtras;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by douglasnunes on 12/17/16.
 */


@EActivity(R.layout.activity_tab)
public class TabLayoutActivity extends AppCompatActivity {

    @ViewById
    FrameLayout fragmentContent;

    @ViewById
    View newsIndicatorView, twitterIndicatorView, resultIndicatorView, journalIndicatorView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState != null){
            return;
        }

        NewsFragment_ newsFragment = new NewsFragment_();
        getSupportFragmentManager().beginTransaction().add(R.id.fragmentContent, newsFragment, "NOTICIAS").commit();

    }

    @AfterViews
    void afterViews(){

        newsClicked();

    }

    @Click(R.id.newsTabItem)
    void newsClicked(){

        newsIndicatorView.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));

        twitterIndicatorView.setBackgroundColor(getResources().getColor(R.color.grayShade2));

        resultIndicatorView.setBackgroundColor(getResources().getColor(R.color.grayShade2));

        journalIndicatorView.setBackgroundColor(getResources().getColor(R.color.grayShade2));

        goTo(new NewsFragment_());

    }

    @Click(R.id.twitterTabItem)
    void twitterClicked(){

        newsIndicatorView.setBackgroundColor(getResources().getColor(R.color.grayShade2));

        twitterIndicatorView.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));

        resultIndicatorView.setBackgroundColor(getResources().getColor(R.color.grayShade2));

        journalIndicatorView.setBackgroundColor(getResources().getColor(R.color.grayShade2));

        goTo(new TwitterFragment_());

    }

    @Click(R.id.resultTabItem)
    void resultClicked(){

        newsIndicatorView.setBackgroundColor(getResources().getColor(R.color.grayShade2));

        twitterIndicatorView.setBackgroundColor(getResources().getColor(R.color.grayShade2));

        resultIndicatorView.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));

        journalIndicatorView.setBackgroundColor(getResources().getColor(R.color.grayShade2));

        goTo(new ResultFragment_());

    }

    @Click(R.id.journalTabItem)
    void journalClicked(){

        newsIndicatorView.setBackgroundColor(getResources().getColor(R.color.grayShade2));

        twitterIndicatorView.setBackgroundColor(getResources().getColor(R.color.grayShade2));

        resultIndicatorView.setBackgroundColor(getResources().getColor(R.color.grayShade2));

        journalIndicatorView.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));

        goTo(new JournalsFragment_());

    }

    private void goTo(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContent, fragment, "MENU").commit();
    }
}
