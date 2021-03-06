package yellowsparkle.gui.types.controller;

import java.util.function.Consumer;

/**
 * Marker for the views that are using the entry per tick change callback method
 * @author ITV1G Group 1
 * @version 1.0
 */
public interface EntryPerTickCallback {
    /**
     * Setter for callback
     * @param entryPerTickCallback Call back to be used
     */
    void setEntryPerTickCallback(Consumer<Integer> entryPerTickCallback);
}
