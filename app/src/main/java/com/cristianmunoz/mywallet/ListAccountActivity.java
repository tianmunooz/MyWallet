package com.cristianmunoz.mywallet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class ListAccountActivity extends AppCompatActivity {

    private ArrayList<Account> listAccountRV = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account2);
        loadFakeData();
    }

    private void loadFakeData() {
        Account myAccount1 = new Account("Bancolombia", "Cuenta Corriente", 189272.0);
        Account myAccount2 = new Account("Davivienda", "Cuenta de ahorros", 45345.0);
        Account myAccount3 = new Account("Lulo", "Cuenta de ahorros", 454354.0);
    }

}