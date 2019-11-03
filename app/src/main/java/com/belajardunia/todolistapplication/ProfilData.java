package com.belajardunia.todolistapplication;

import java.util.ArrayList;

public class ProfilData {

    public static String[] dataProfil = new String[]{
            "Tambah Destinasi Baru",
            "Favorite Anda",
            "Undang Teman",
            "Penilaian Saya",
            "Pengaturan Akun",
            "Bantuan",
            "Laporan Penyalahgunaan",
            "Info Aplikasi",
            "Keluar"
    };

    public static ArrayList<Profil> getListData() {
        ArrayList<Profil> list = new ArrayList<>();
        for (int position = 0; position < dataProfil.length; position++) {
            Profil profil = new Profil();
            profil.setMenuprofil(dataProfil[position]);
            list.add(profil);
        }
        return list;
    }
}
