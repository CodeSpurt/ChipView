package com.codespurt.chipview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.plumillonforge.android.chipview.Chip;
import com.plumillonforge.android.chipview.ChipView;
import com.plumillonforge.android.chipview.OnChipClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ChipView chipDefault;

    private int numberOfChips = 10;
    private List<Chip> chipList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chipDefault = (ChipView) findViewById(R.id.chipview);

        // add dummy chips
        chipList = new ArrayList<>();
        for (int countr = 0; countr < numberOfChips; countr++) {
            chipList.add(new Tag("Chip " + String.valueOf(countr + 1)));
        }

        // set chips
        setChipList(chipList);

        chipDefault.setOnChipClickListener(new OnChipClickListener() {

            @Override
            public void onChipClick(Chip chip) {
                // delete selected chips
                chipList.remove(chip);

                // set chips
                setChipList(chipList);
            }
        });
    }

    private void setChipList(List<Chip> chipList) {
        chipDefault.setChipList(chipList);
    }
}