package com.example.customcalendarviewwithevents;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class CustumCalendarView extends LinearLayout {
    ImageButton NextButton, PreviousButton;
    TextView CurrentDate;
    GridView gridView;
    private static final int MAX_CALENDAR_DAYS = 42;
    Calendar calendar = Calendar.getInstance(Locale.ENGLISH);
    Context context;

    List<Date> dates = new ArrayList<>();
    List<Events> eventList = new ArrayList<>();
    
    public CustumCalendarView(Context context) {
        super(context);
    }

    public CustumCalendarView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
}
