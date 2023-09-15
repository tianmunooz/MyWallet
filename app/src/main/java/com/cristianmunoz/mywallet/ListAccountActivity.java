package com.cristianmunoz.mywallet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class ListAccountActivity extends AppCompatActivity {

    private ArrayList<Account> listAccountRV = new ArrayList<>();
    private RecyclerView rvListAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account2);
        loadFakeData();
        rvListAccount = findViewById(R.id.rv_account);
        AccountAdapter myAdapter = new AccountAdapter(listAccountRV);
        rvListAccount.setAdapter(myAdapter);

        rvListAccount.setLayoutManager(new LinearLayoutManager(ListAccountActivity.this));
    }

    private void loadFakeData() {
        Account myAccount1 = new Account("Bancolombia", "Cuenta Corriente", 189272.0,"https://www.bancolombia.com/wcm/connect/b8e4c3f2-36a9-497d-a125-ac04f83b0bf8/LogoBancolombia.png?MOD=AJPERES");
        Account myAccount2 = new Account("Davivienda", "Cuenta de ahorros", 45345.0,"https://static.wikia.nocookie.net/logopedia/images/e/ea/Casitadavivienda2006.png/revision/latest/scale-to-width-down/250?cb=20210428005805&path-prefix=es");
        Account myAccount3 = new Account("Lulo", "Cuenta de ahorros", 454354.0,"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAOEAAADhCAMAAAAJbSJIAAAAZlBMVEXm/wETFyPm/wAAABPB0xsAAADp/xaktiITFiTO30br/zpIUh3o/wA1PRPW6i8JDxwNEh3c8xoAAAjN3kBETCQ/SBszOhoYHxS9ylU2Phzc7Vnx/1gKDRwRGCPK2VDW6jAWGxTh9wp/B2JXAAAC3UlEQVR4nO2d2XLaQBBFhYCYzRJ4jR1n+/+fDE6RVEEmUY8yI27PnFO2y09jnW7d6wco0TRQAO3pu9hfABwgkhZyCFA0In1A00DViKSFHAIUjUgf0DRQNSJpIYcARSPSBzQNVI1IWsghQNGI9AFNA1UjkhZyCFA0In1A00wLoxFjxM2ddoetYg4/JGX0ZeThfYOHm6Qcmt21rc5pd4u7eUKW99c2uqRtFvPVLBmr5Tr7BUfHdzFPJ/jLUKlp8hgqgaGcITkMjMTZDqPBEMPJDWmawEic7TAaDOUMyWFgJM52GA2GGE5uSNMERuJsh9FgKGdIDgMjcbbDaDDEcHJDmiYwEmc7jAZDOUNyGBiJsx1Gg+GJzzGGlttpurczGA1Xs1k/zFvfL9eZrz1f0zw/bC08flxbuD/8vlyVptm/vG4sfHpcmriZ7K1FZsPbbtca2GzfVgbmmoaW4zbb3nLceMNsOfxpOHzgu6Gld0+GUjk87XDgz+TfYTSRhkN3qn/DweOOTYPh/xkKNE2MoWLTDB3HXYqh4YLJ4R8jcbbDaDDE8PI4mubckKZJAYZyhuQwMBJnO4wGQwwvj6Npzg1pmhRgKGdIDgMjcbbDaDC8MDS8buHccPC4Gl4/rKBpLI9oEL1Lra/jOzV8+tJ13dduiNcHr//xZ9+ebi28PJueIyKYw+MW930//LW3HSZ4l5rf2ebXMC0Y/uuCczVNFkOtpslhOAUYyhmSw8BInO0QQwz1DWmawEic7RBD/4bkMDASZzvEEEN9Q5omMBJnO8TQvyE5DIzE2Q4xxFDfkKYJjMTZDjH0b0gOAyNJ+hklRiZ9akTiz5kxcjedYdN8X1yDw9ibzgvjH9MT3TTHn1dhVClCEAYjx7ib29EvACCASB/QNFA1ImkhhwBFI9IHNA1UjUhayCFA0Yj0AU0DVSOSFnIIUDQifUDTQNWIpIUcAhSNSB/QNFA1Imkhh/A3fgA+8WvIkIaZEQAAAABJRU5ErkJggg==");
        listAccountRV.add(myAccount1);
        listAccountRV.add(myAccount2);
        listAccountRV.add(myAccount3);
    }

}