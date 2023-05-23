package com.aurelhubert.ahbottomnavigation;

import android.graphics.Color;
import android.graphics.drawable.Drawable;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * AHBottomNavigationItem
 * The item is display in the AHBottomNavigation layout
 */
public class AHBottomNavigationItem {
    public String title = "";
    public Drawable checkDrawable;
    public Drawable unCheckDrawable;
    @ColorInt
    public int bgIconColor = Color.GRAY;
    public int iconWidth;
    public int iconHeight;
    public int iconBottomMargin;

    public AHBottomNavigationItem(@NonNull String title, @Nullable Drawable checkDrawable) {
        this.title = title;
        this.checkDrawable = checkDrawable;
        this.unCheckDrawable = checkDrawable;
    }

    public AHBottomNavigationItem(@NonNull String title, @Nullable Drawable checkDrawable, @ColorInt int bgIconColor) {
        this.title = title;
        this.checkDrawable = checkDrawable;
        this.unCheckDrawable = checkDrawable;
        this.bgIconColor = bgIconColor;
    }
}
