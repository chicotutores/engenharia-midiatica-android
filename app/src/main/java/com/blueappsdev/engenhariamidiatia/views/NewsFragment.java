package com.blueappsdev.engenhariamidiatia.views;

import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.blueappsdev.engenhariamidiatia.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

/**
 * Created by douglasnunes on 12/17/16.
 */

@EFragment(R.layout.fragment_news)
public class NewsFragment extends Fragment{

    @ViewById
    RecyclerView newsRecyclerView;

    RecyclerView.LayoutManager layoutManager;

    RecyclerView.Adapter adapter;

    @AfterViews
    void afterViews(){

        newsRecyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getActivity());

        newsRecyclerView.setLayoutManager(layoutManager);



    }

}
