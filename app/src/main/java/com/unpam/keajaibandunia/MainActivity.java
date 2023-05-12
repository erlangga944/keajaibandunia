package com.unpam.keajaibandunia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView rMenu = findViewById(R.id.rMenu);
        ArrayList<keajaiban>flags = new ArrayList<>();
        rMenu.setAdapter(new adapter(flags, this));
        flags.add(new keajaiban("Tembok cina","Tembok Besar China menjadi salah satu konstruksi bangunan terbesar di dunia, " +
                "yang diperkirakan memiliki panjang sekitar 8.850 km.",R.drawable.tembokcina));
        flags.add(new keajaiban("Chichén Itzá ","Chichén Itzá adalah kota Maya yang berkembang pada abad ke-9 dan ke-10 Masehi " +
                "di semenanjung Yucatán di Meksiko. Di bawah suku Maya Itzá.",R.drawable.chichenitza));
        flags.add(new keajaiban("Colosseum","Colosseum di Roma adalah satu dari 7 keajaiban dunia yang dibangun pada " +
                "abad pertama atas perintah Kaisar Vespasianus.",R.drawable.colosseum));
        flags.add(new keajaiban("Machupichu","Machu Picchu adalah situs ziarah, sementara yang lain juga percaya " +
                "situs itu adalah tempat peristirahatan kerajaan. Machu Picchu adalah salah satu dari sedikit reruntuhan besar pra-Columbus " +
                "yang ditemukan hampir dalam keadaan utuh.",R.drawable.machupichu));
        flags.add(new keajaiban("Patung Christ the Redeemer","Asal-usulnya dibangunnya patung ini ketika beberapa orang Brasil " +
                "takut akan “gelombang ketidakbertuhanan” yang terjadi tepat setelah Perang Dunia I. Mereka mengusulkan " +
                "sebuah patung, yang pada akhirnya dirancang oleh Heitor da Silva Costa, Carlos Oswald, dan Paul Landowski.",R.drawable.patungkristus));
        flags.add(new keajaiban("Petra","Satu dari 7 keajaiban dunia selanjutnya adalah kota kuno Petra di Yordania. " +
                "Lokasinya berada di lembah terpencil antara pegunungan dan tebing batu pasir. Bangunan itu konon menjadi salah satu" +
                " tempat di mana Musa memukul batu yang mengakibatkan air menyembur keluar.",R.drawable.petra));
        flags.add(new keajaiban("Taj mahal","Taj Mahal menjadi salah satu monumen paling ikonik di dunia. \n" +
                "Dalam prosesnya, butuh waktu sekitar 22 tahun dan 20.000 pekerja untuk membangun kompleks tersebut, yang meliputi taman yang sangat luas " +
                "dengan kolam yang memantulkan cahaya.",R.drawable.tajmahal));


        rMenu.setLayoutManager(new GridLayoutManager(this,2));
    }
}