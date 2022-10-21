package com.example.application.ui5webcomponents;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasLabel;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("ui5-mcb-item")
@NpmPackage(value = "@ui5/webcomponents", version = "^1.8.0")
@JsModule("@ui5/webcomponents/dist/MultiComboBoxItem.js")
public class MultiComboBoxItem extends Component implements HasComponents, HasLabel, HasSize {

   public void setPlaceholder(String placeholder) {
      this.getElement().setProperty("placeholder", placeholder);
   }

   public void setText(String text) {
      this.getElement().setProperty("text", text);
   }

   public void setAdditionalText(String addText) {
      this.getElement().setProperty("additionalText", addText);
   }

}