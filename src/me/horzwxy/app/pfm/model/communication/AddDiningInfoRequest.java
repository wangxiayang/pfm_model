package me.horzwxy.app.pfm.model.communication;

import me.horzwxy.app.pfm.model.data.Dining;

public class AddDiningInfoRequest extends Request<Dining> {

    public static final String RESTAURANT_KEY = "restaurant";
    public static final String DATE_KEY = "date";
    public static final String COST_KEY = "cost";
    public static final String PARTICIPANTS_KEY = "participants";
    public static final String SPECIALCOSTS_KEY = "specialCosts";
    public static final String PAIDS_KEY = "paids";
    public static final String AUTHOR_KEY = "author";

    public AddDiningInfoRequest(Dining attachment) {
        super(attachment);
    }

    @Override
    public String getServletPattern() {
        return "/newdining";
    }
}