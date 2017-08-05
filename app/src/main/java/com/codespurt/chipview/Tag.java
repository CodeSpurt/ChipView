package com.codespurt.chipview;

import com.plumillonforge.android.chipview.Chip;

/**
 * Created by CodeSpurt on 05-08-2017.
 */

public class Tag implements Chip {

    private String name;
    private int type = 0;

    public Tag(String name, int type) {
        this(name);
        this.type = type;
    }

    public Tag(String name) {
        this.name = name;
    }

    @Override
    public String getText() {
        return name;
    }

    public int getType() {
        return type;
    }
}