package de.kurka.phonegap.client.event;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

public interface HasPauseHandlers extends HasHandlers {
	public HandlerRegistration addPauseHandler(PauseHandler handler);
}