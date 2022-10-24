package com.example.application.ui5webcomponents;

import com.vaadin.flow.component.HasEnabled;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.GeneratedVaadinButton;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("ui5-button")
@NpmPackage(value = "@ui5/webcomponents", version = "^1.8.0")
@JsModule("@ui5/webcomponents/dist/Button.js")
public class Ui5Button extends GeneratedVaadinButton<Button> implements HasSize, HasEnabled {

   public Ui5Button() {
   }

   public Ui5Button(String text) {
      this.setText(text);
   }

   public void setIcon(String icon) {
      this.getElement().setProperty("icon", icon);
   }

   public void setDesign(String design) {
      this.getElement().setProperty("design", design);
   }

}
