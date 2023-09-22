package com.cristianmunoz.mywallet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListCategoriesActivity extends AppCompatActivity {

    private ArrayList<Category> listcategoriestRV = new ArrayList<>();
    private RecyclerView rvListcategories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_categories);
        loadFakeData();
        rvListcategories = findViewById(R.id.rv_category);
        AccountAdapter myAdapter = new AccountAdapter(listcategoriestRV);
        rvListcategories.setAdapter(myAdapter);

        rvListcategories.setLayoutManager(new LinearLayoutManager(ListCategoriesActivity.this));
    }

    private void loadFakeData() {
        Category myCategories1 = new Account("Bancolombia", "Cuenta Corriente","https://www.bancolombia.com/wcm/connect/b8e4c3f2-36a9-497d-a125-ac04f83b0bf8/LogoBancolombia.png?MOD=AJPERES");
        Category myCategories2 = new Account("Davivienda", "Cuenta de ahorros","https://static.wikia.nocookie.net/logopedia/images/e/ea/Casitadavivienda2006.png/revision/latest/scale-to-width-down/250?cb=20210428005805&path-prefix=es");
        Category myCategories3 = new Account("Lulo", "Cuenta de ahorros","data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAOEAAADhCAMAAAAJbSJIAAAAZlBMVEXm/wETFyPm/wAAABPB0xsAAADp/xaktiITFiTO30br/zpIUh3o/wA1PRPW6i8JDxwNEh3c8xoAAAjN3kBETCQ/SBszOhoYHxS9ylU2Phzc7Vnx/1gKDRwRGCPK2VDW6jAWGxTh9wp/B2JXAAAC3UlEQVR4nO2d2XLaQBBFhYCYzRJ4jR1n+/+fDE6RVEEmUY8yI27PnFO2y09jnW7d6wco0TRQAO3pu9hfABwgkhZyCFA0In1A00DViKSFHAIUjUgf0DRQNSJpIYcARSPSBzQNVI1IWsghQNGI9AFNA1UjkhZyCFA0In1A00wLoxFjxM2ddoetYg4/JGX0ZeThfYOHm6Qcmt21rc5pd4u7eUKW99c2uqRtFvPVLBmr5Tr7BUfHdzFPJ/jLUKlp8hgqgaGcITkMjMTZDqPBEMPJDWmawEic7TAaDOUMyWFgJM52GA2GGE5uSNMERuJsh9FgKGdIDgMjcbbDaDDEcHJDmiYwEmc7jAZDOUNyGBiJsx1Gg+GJzzGGlttpurczGA1Xs1k/zFvfL9eZrz1f0zw/bC08flxbuD/8vlyVptm/vG4sfHpcmriZ7K1FZsPbbtca2GzfVgbmmoaW4zbb3nLceMNsOfxpOHzgu6Gld0+GUjk87XDgz+TfYTSRhkN3qn/DweOOTYPh/xkKNE2MoWLTDB3HXYqh4YLJ4R8jcbbDaDDE8PI4mubckKZJAYZyhuQwMBJnO4wGQwwvj6Npzg1pmhRgKGdIDgMjcbbDaDC8MDS8buHccPC4Gl4/rKBpLI9oEL1Lra/jOzV8+tJ13dduiNcHr//xZ9+ebi28PJueIyKYw+MW930//LW3HSZ4l5rf2ebXMC0Y/uuCczVNFkOtpslhOAUYyhmSw8BInO0QQwz1DWmawEic7RBD/4bkMDASZzvEEEN9Q5omMBJnO8TQvyE5DIzE2Q4xxFDfkKYJjMTZDjH0b0gOAyNJ+hklRiZ9akTiz5kxcjedYdN8X1yDw9ibzgvjH9MT3TTHn1dhVClCEAYjx7ib29EvACCASB/QNFA1ImkhhwBFI9IHNA1UjUhayCFA0Yj0AU0DVSOSFnIIUDQifUDTQNWIpIUcAhSNSB/QNFA1Imkhh/A3fgA+8WvIkIaZEQAAAABJRU5ErkJggg==");
        listcategoriestRV.add(myCategories1);
        listcategoriestRV.add(myCategories2);
        listcategoriestRV.add(myCategories3);
    }

}