package com.appprova.daryl;

import java.util.HashMap;
import java.util.Map;

public class EventBuilder {

    final Map<String, Object> event;

    public EventBuilder() {
        event = new HashMap<>();
    }

    public EventBuilder setCategory(String category) {
        event.put(Constants.EVENT_CATEGORY, category);
        return this;
    }

    public EventBuilder setAction(String action) {
        event.put(Constants.EVENT_ACTION, action);
        return this;
    }

    public EventBuilder setLabel(String label) {
        event.put(Constants.EVENT_LABEL, label);
        return this;
    }

    public EventBuilder setProperty(String key, String value) {
        event.put(key, value);
        return this;
    }

    public Map<String, Object> get() {
        return this.event;
    }
}
