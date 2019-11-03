package com.belajardunia.todolistapplication.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.belajardunia.todolistapplication.Adapter;
import com.belajardunia.todolistapplication.Profil;
import com.belajardunia.todolistapplication.ProfilData;
import com.belajardunia.todolistapplication.R;

import java.util.ArrayList;

public class NotificationsFragment extends Fragment {

    private RecyclerView rvMenus;
    private ArrayList<Profil> menu = new ArrayList<>();

    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        notificationsViewModel =
//                ViewModelProviders.of(this).get(NotificationsViewModel.class);
//        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
//        final TextView textView = root.findViewById(R.id.endpage);
//        notificationsViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);

        View view = inflater.inflate(R.layout.fragment_notifications, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_menus_profil);

        Adapter adapter = new Adapter(menu);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager =  new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        menu.addAll(ProfilData.getListData());


        return view;

//                menu.addAll(ProfilData.getListData());
//                showRecyclerList();
            }
//        return root;
    }

//    private void showRecyclerList(){
//        rvMenus.setLayoutManager(new LinearLayoutManager(this));
//        Adapter listHeroAdapter = new Adapter(menu);
//        rvMenus.setAdapter(listHeroAdapter);
//    }
//}