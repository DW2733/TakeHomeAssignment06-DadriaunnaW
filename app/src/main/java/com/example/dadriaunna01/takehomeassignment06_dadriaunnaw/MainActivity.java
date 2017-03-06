package com.example.dadriaunna01.takehomeassignment06_dadriaunnaw;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText amount;
    EditText taxPercentage;
    EditText tipPercentage;
//    static final int TIP_CALCULATOR_REQUEST = 1;  // The request code

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount = (EditText) findViewById(R.id.input_amount);
        taxPercentage = (EditText) findViewById(R.id.tax_percentage);
        tipPercentage = (EditText) findViewById(R.id.tip_percentage);

    }

    public void submit(View view) {

        String inputAmount = amount.getText().toString();
        double amount1 = (double) Double.parseDouble(inputAmount);
        String inputTaxPercentage = taxPercentage.getText().toString();
        double taxPercentage1 = (double) Double.parseDouble(inputTaxPercentage);
        String inputTipPercentage = tipPercentage.getText().toString();
        double tipPercentage1 = (double) Double.parseDouble(inputTipPercentage);

        Intent intent = new Intent(this, DisplayActivity.class);
        RecieptInformation reciept1 = new RecieptInformation(amount1, taxPercentage1, tipPercentage1);
        intent.putExtra(Keys.NEW_ORDER, reciept1);

        startActivity(intent);

    }

//    private void calculateResult(){
//        Intent calculateResultIntent = new Intent(Intent.ACTION_PICK, Uri.parse("content://contacts"));
//        calculateResultIntent.setType(Phone.CONTENT_TYPE); // Show user only contacts w/ phone numbers
//        startActivityForResult(calculateResultIntent, TIP_CALCULATOR_REQUEST);
//    }
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        // Check which request we're responding to
//        if (requestCode == TIP_CALCULATOR_REQUEST) {
//            // Make sure the request was successful
//            if (resultCode == RESULT_OK) {
//                // The user picked a contact.
//                // The Intent's data Uri identifies which contact was selected.
//
//                // Do something with the contact here (bigger example below)
//            }
//        }
}
