package com.example.application.ui5webcomponents;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasLabel;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.shared.Registration;

import elemental.json.JsonArray;

@Tag("ui5-multi-combobox")
@NpmPackage(value = "@ui5/webcomponents", version = "^1.8.0")
@JsModule("@ui5/webcomponents/dist/MultiComboBox.js")
@JsModule("@ui5/webcomponents/dist/features/InputElementsFormSupport.js")
public class Ui5MultiComboBox extends Component implements HasComponents, HasLabel, HasSize {

   public void setPlaceholder(String placeholder) {
      this.getElement().setProperty("placeholder", placeholder);
   }

   @DomEvent("selection-change")
   public static class SelectionChangeEvent extends ComponentEvent<Ui5MultiComboBox> {
      public SelectionChangeEvent(Ui5MultiComboBox source, boolean fromClient,
            @EventData("element.placeholder") String placeholder,
            @EventData("event.bubbles") boolean bubbles,
            @EventData("event.items") JsonArray itemsa) {
         super(source, fromClient);
      }
   }

   public Registration addSelectionChangeListener(ComponentEventListener<SelectionChangeEvent> listener) {
      return addListener(SelectionChangeEvent.class, listener);
   }
}